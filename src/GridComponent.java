/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * Interface for components that can be placed on the grid.
 * Components must implement the method to check if a position is valid.
 */
public interface GridComponent {
    /**
     * Checks if a position is valid.
     * @param x the X coordinate
     * @param y the Y coordinate
     * @return true if the position is valid, false otherwise
     */
    boolean isValidPosition(int x, int y);
}
