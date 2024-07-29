/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * Command to move the rover forward.
 */
public class MoveCommand implements Command {
    private Rover rover;

    /**
     * Constructs a MoveCommand for the specified rover.
     * @param rover the rover to be moved
     */
    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() throws MarsRoverException {
        rover.move();
    }
}
