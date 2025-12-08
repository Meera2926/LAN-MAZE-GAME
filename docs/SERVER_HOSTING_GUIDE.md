# LAN Maze Game - Server Hosting & Setup Guide

## How to Host a LAN Match
1. Compile the project with Maven:
   ```bash
   mvn clean package
   ```
2. Start the game server:
   ```bash
   java Server
   ```
3. Share your local IP (e.g. `192.168.1.X`) with other players on your Wi-Fi / Ethernet LAN.
4. Clients join via GUI by entering host IP and port `12345`.
