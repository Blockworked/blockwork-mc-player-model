#!/bin/sh
# Starts the dataset server; stop it with "stop" over RCON or Ctrl+C.
cd "$(dirname "$0")" && exec java -Xmx8G -jar fabric-server-launch.jar nogui
