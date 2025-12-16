# 🏃‍♂️ LAN Maze Game - Real-time Multiplayer Maze Escape

[![Java CI with Maven](https://github.com/Meera2926/LAN-MAZE-GAME/actions/workflows/maven_ci.yml/badge.svg)](https://github.com/Meera2926/LAN-MAZE-GAME/actions)
[![Language](https://img.shields.io/badge/Language-Java_17-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A real-time multiplayer 2D maze game developed in Java Swing, designed for competitive play over a Local Area Network (LAN). Players race against each other and autonomous AI bots to collect coins, avoid traps, use power-ups, and escape the labyrinth.

---

## 🎮 Key Features

- **🌐 LAN Multiplayer**: Seamless client-server architecture over TCP sockets with 20Hz tick synchronization.
- **🌀 Procedural Generation**: Infinite unique labyrinths powered by Recursive Backtracking & Prim's algorithms.
- **🤖 Autonomous AI Bots**: Intelligent computer competitors powered by A* heuristic pathfinding and BFS.
- **⚡ Dynamic Power-Ups**: Speed Boost, Ghost Phasing, paired teleportation portals, and Freeze Debuffs.
- **⚠️ Hazard Traps**: Spike traps inflicting temporary movement debuffs on careless runners.
- **👁️ Spectator Mode**: Real-time spectator view for eliminated competitors.
- **🏆 Persistent Leaderboards**: Real-time scoring, coin combo streaks, and top player rankings.
- **🎨 Custom Visual Themes**: Classic Stone, Neon Cyberpunk, and Dungeon Dark themes.

---

## 🕹️ Controls

| Action | Key / Input |
| :--- | :--- |
| **Move Up** | `W` or `Up Arrow` |
| **Move Down** | `S` or `Down Arrow` |
| **Move Left** | `A` or `Left Arrow` |
| **Move Right** | `D` or `Right Arrow` |
| **Use Power-up** | `Spacebar` |
| **Pause / Menu** | `Escape` |

---

## 🚀 Quick Start

```bash
# 1. Clone repository
git clone https://github.com/Meera2926/LAN-MAZE-GAME.git
cd LAN-MAZE-GAME

# 2. Build with Maven
mvn clean package

# 3. Start Server
java Server

# 4. Start Client
java MazeRunnerSwingClient
```

---

## 📚 Technical Documentation
- [Maze Generation Algorithms](docs/MAZE_GENERATION_ALGORITHMS.md)
- [Pathfinding & Solver Benchmarks](docs/PATHFINDING_BENCHMARKS.md)
- [Multiplayer Network Protocol](docs/MULTIPLAYER_NETWORK_PROTOCOL.md)
- [Game Balance & Power-Ups](docs/GAME_BALANCE_AND_POWERUPS.md)
- [Themes & Skins Guide](docs/MAZE_THEMES_AND_SKINS.md)
- [AI Pathfinding Guide](docs/AI_PATHFINDING_GUIDE.md)
- [Server Hosting Guide](docs/SERVER_HOSTING_GUIDE.md)

---

## 📄 License
This project is open-source under the MIT License.
