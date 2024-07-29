/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * The Command interface defines a contract for command objects.
 * Each command has an execute method which performs a specific action.
 */
public interface Command {
    /**
     * Executes the command.
     * @throws MarsRoverException if an error occurs during execution
     */
    void execute() throws MarsRoverException;
}
