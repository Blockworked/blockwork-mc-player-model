# Dataset server

Fabric 26.3 + Carpet (`fabric-carpet-26.3+v260915`). Not stored here: the
world, jars, `eula.txt`, whitelist/ops, and `rcon-password.txt`.

Set these in `server.properties`:

```
enable-rcon=true
rcon.port=25575
rcon.password=<something>
online-mode=true
white-list=true
difficulty=peaceful
spawn-monsters=false
spawn-protection=0
view-distance=8
simulation-distance=6
```

`start.sh` runs the server (4 GB heap). See the top-level README for the rest.
