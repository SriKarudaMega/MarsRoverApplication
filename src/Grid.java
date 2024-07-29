/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Represents a grid on which the Mars Rover operates.
 * The grid can contain obstacles, and provides methods to validate positions.
 */
public class Grid implements GridComponent {
    private static final Logger LOGGER = Logger.getLogger(Grid.class.getName());
    private int width, height;
    private List<GridComponent> components = new ArrayList<>();

    /**
     * Constructs a Grid with specified dimensions.
     * @param width the width of the grid
     * @param height the height of the grid
     * @throws IllegalArgumentException if width or height is non-positive
     */
    public Grid(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Grid dimensions must be positive");
        }
        this.width = width;
        this.height = height;
        LOGGER.info("Grid created with dimensions: " + width + "x" + height);
    }

    /**
     * Adds a component to the grid.
     * @param component the component to be added
     */
    public void addComponent(GridComponent component) {
        components.add(component);
        LOGGER.fine("Added component to grid: " + component);
    }

    @Override
    public boolean isValidPosition(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            LOGGER.warning("Invalid position: (" + x + ", " + y + ")");
            return false;
        }
        for (GridComponent component : components) {
            if (!component.isValidPosition(x, y)) {
                LOGGER.fine("Position occupied by obstacle: (" + x + ", " + y + ")");
                return false;
            }
        }
        return true;
    }
}
