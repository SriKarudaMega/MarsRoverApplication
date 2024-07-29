/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * Base exception class for errors related to the Mars Rover simulation.
 */
public class MarsRoverException extends Exception {
    /**
     * Constructs a MarsRoverException with the specified message.
     * @param message the detail message
     */
    public MarsRoverException(String message) {
        super(message);
    }
}
