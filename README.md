# 🏃💨 LAN Maze Escape Game (v1.3.0)

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/Meera2926/LAN-MAZE-GAME)
[![Java Version](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://openjdk.org)
[![Multiplayer](https://img.shields.io/badge/Multiplayer-LAN%20Sockets-orange.svg)](docs/NETWORK_PROTOCOL.md)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A high-performance LAN multiplayer maze escape runner developed in Java Swing with custom TCP socket networking, AI bot adversaries, procedural labyrinth generators, dynamic fog of war, and rich interactive mechanics.

---

## 🎮 Key Features

- **🌐 Real-Time LAN Multiplayer**: Custom TCP socket protocol with binary packet serialization, latency tracking, and zero lag.
- **🛡️ Shield & Power-Up System**: Speed boosts, freeze spells, portal teleporters, and invulnerability shields.
- **🌫️ Fog of War Stealth Mode**: Dynamic circular visibility radius with explored tile memory.
- **🏆 In-Game Achievements**: Unlockable trophies tracking speed, evasion, and coin hoarding feats.
- **🧩 Procedural Maze Generation**: Recursive Backtracking, Prim's, Kruskal's, and Eller's algorithms.
- **🤖 Heuristic AI Bots**: Autonomous computer runners powered by A*, Dijkstra, and BFS solvers.
- **💬 Match Chat & Quick Wheel**: Lobby and in-match messaging with low-overhead packet encoding.
- **🔄 LAN Reconnection**: Seamless session snapshot recovery across brief network interruptions.

---

## 🚀 How to Run

```bash
# 1. Start Server
java -cp target/classes maze.network.Server 8080

# 2. Start Client (Player 1)
java -cp target/classes maze.ui.MazeRunnerSwingClient

# 3. Start Client (Player 2 on another machine)
java -cp target/classes maze.ui.MazeRunnerSwingClient <SERVER_IP> 8080
```

---

## 📚 Documentation
- [Achievement Guide](docs/ACHIEVEMENTS_GUIDE.md)
- [Fog of War Specifications](docs/FOG_OF_WAR_SPECS.md)
- [Network Packet Protocol](docs/NETWORK_PROTOCOL.md)
- [Bot Customization Guide](docs/BOT_EXTENSION_GUIDE.md)

---

## 📄 License
Open source under the [MIT License](LICENSE).
