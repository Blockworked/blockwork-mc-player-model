package blockwork.nochat.mixin;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.ChatComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Never draw chat, so "Saved screenshot" lines can't end up in dataset frames.
@Mixin(ChatComponent.class)
public class ChatComponentMixin {
    @Inject(method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIILnet/minecraft/client/gui/components/ChatComponent$DisplayMode;Z)V",
            at = @At("HEAD"), cancellable = true)
    private void blockwork$hide(GuiGraphicsExtractor graphics, Font font, int a, int b, int c,
                                ChatComponent.DisplayMode mode, boolean d, CallbackInfo ci) {
        ci.cancel();
    }
}
