# AI Bot Challenger Development Guide

## Extending the Bot AI
Developers can implement custom autonomous agents by extending the `MazeBot` class:
1. Subclass `Pathfinder` with custom heuristic weights.
2. Plug into `BotManager` with desired tick rate.
3. Implement dynamic obstacle avoidance to evade traps.
