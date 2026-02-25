# Fog of War Dynamic Occlusion Specification

## Vision Formulation
Tiles are visible to the player if their Euclidean distance satisfies:
$$\Delta x^2 + \Delta y^2 \le R_{view}^2$$

- **Default sight radius ($R_{view}$)**: 3 tiles.
- **Lantern Power-Up bonus**: +2 sight tiles.
- **Explored Memory**: Uncovered tiles remain rendered in dimmed grayscale.
