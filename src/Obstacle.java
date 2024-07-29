/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * Represents an obstacle on the grid.
 * Obstacles prevent the rover from moving to their position.
 */
public class Obstacle implements GridComponent {
    private Position position;

    /**
     * Constructs an Obstacle at the specified position.
     * @param position the position of the obstacle
     */
    public Obstacle(Position position) {
        this.position = position;
    }

    @Override
    public boolean isValidPosition(int x, int y) {
        return !position.equals(new Position(x, y));
    }
}
