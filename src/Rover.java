/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Represents the Mars Rover, including its position, direction, and movement.
 */
public class Rover {
    private static final Logger LOGGER = Logger.getLogger(Rover.class.getName());
    private int x, y;
    private Direction direction;
    private Grid grid;

    /**
     * Constructs a Rover at the specified position and direction on the grid.
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param direction the initial direction
     * @param grid the grid on which the rover operates
     * @throws InvalidPositionException if the initial position is invalid
     */
    public Rover(int x, int y, Direction direction, Grid grid) throws InvalidPositionException {
        if (!grid.isValidPosition(x, y)) {
            throw new InvalidPositionException("Invalid starting position for Rover");
        }
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
        LOGGER.info("Rover created at position (" + x + ", " + y + ") facing " + direction);
    }

    /**
     * Moves the rover forward one step in the current direction.
     * @throws InvalidPositionException if the move is not possible
     */
    public void move() throws InvalidPositionException {
        int newX = x + direction.getDeltaX();
        int newY = y + direction.getDeltaY();
        if (grid.isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
            LOGGER.fine("Rover moved to (" + x + ", " + y + ")");
        } else {
            LOGGER.warning("Obstacle detected. Cannot move to (" + newX + ", " + newY + ")");
            throw new InvalidPositionException("Obstacle detected. Cannot move.");
        }
    }

    /**
     * Turns the rover left.
     */
    public void turnLeft() {
        direction = direction.left();
        LOGGER.fine("Rover turned left, now facing " + direction);
    }

    /**
     * Turns the rover right.
     */
    public void turnRight() {
        direction = direction.right();
        LOGGER.fine("Rover turned right, now facing " + direction);
    }

    /**
     * Gets the current status of the rover.
     * @return a string describing the rover's position and direction
     */
    public String getStatus() {
        return String.format("Rover is at (%d, %d) facing %s.", x, y, direction);
    }
}
