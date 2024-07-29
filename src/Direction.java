/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * Enum representing the four cardinal directions.
 * Each direction has associated delta values for X and Y coordinates.
 */
public enum Direction {
    N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

    private int deltaX, deltaY;

    /**
     * Constructor for the Direction enum.
     * @param deltaX the change in X coordinate for the direction
     * @param deltaY the change in Y coordinate for the direction
     */
    Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    /**
     * Gets the change in X coordinate for the direction.
     * @return the delta X value
     */
    public int getDeltaX() {
        return deltaX;
    }

    /**
     * Gets the change in Y coordinate for the direction.
     * @return the delta Y value
     */
    public int getDeltaY() {
        return deltaY;
    }

    /**
     * Gets the direction to the left of the current direction.
     * @return the new direction after turning left
     */
    public Direction left() {
        return values()[(ordinal() + 3) % 4];
    }

    /**
     * Gets the direction to the right of the current direction.
     * @return the new direction after turning right
     */
    public Direction right() {
        return values()[(ordinal() + 1) % 4];
    }
}
