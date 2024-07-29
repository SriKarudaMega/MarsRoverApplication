/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srika
 */
/**
 * Command to turn the rover right.
 */
public class TurnRightCommand implements Command {
    private Rover rover;

    /**
     * Constructs a TurnRightCommand for the specified rover.
     * @param rover the rover to be turned right
     */
    public TurnRightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}

