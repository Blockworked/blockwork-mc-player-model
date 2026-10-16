#!/bin/sh
# Builds blockwork-nochat.jar with plain javac (26.3 is unobfuscated, so no remapping).
set -e
cd "$(dirname "$0")"
MC=${MC_CLIENT_JAR:-$HOME/.local/share/PrismLauncher/libraries/com/mojang/minecraft/26.3/minecraft-26.3-client.jar}
LIBS=${FABRIC_LIBS:-$HOME/Games/blockwork-mc-server/libraries/net/fabricmc}
CP="$MC:$(ls $LIBS/fabric-loader/*/*.jar):$(ls $LIBS/sponge-mixin/*/*.jar)"
rm -rf build && mkdir -p build/classes
javac --release 21 -proc:none -cp "$CP" -d build/classes $(find src -name '*.java')
cp res/* build/classes/
(cd build/classes && jar cf ../blockwork-nochat.jar .)
echo build/blockwork-nochat.jar
