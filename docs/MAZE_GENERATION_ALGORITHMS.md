# Maze Generation Algorithms Specification

## Overview
This game supports multiple procedural maze generation algorithms:

1. **Recursive Backtracker (DFS)**:
   - High river factor (long, winding corridors).
   - Generates perfect mazes (no loops, every cell reachable).

2. **Randomized Prim's Algorithm**:
   - High branching factor with numerous short dead-ends.
   - More open appearance with balanced difficulty.

3. **Randomized Kruskal's Algorithm**:
   - Minimum spanning tree of a graph.
   - Uniform distribution of dead ends.
