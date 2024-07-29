/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author srika
 */
public class MarsRoverApp {
    private static final Logger LOGGER = Logger.getLogger(MarsRoverApp.class.getName());

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Grid grid = createGrid(scanner);
            addObstacles(scanner, grid);
            Rover rover = createRover(scanner, grid);
            List<Command> commands = getCommands(scanner, rover);
            executeCommands(commands, rover);
            System.out.println(rover.getStatus());
            scanner.close();
        } catch (InvalidPositionException e) {
            LOGGER.log(Level.SEVERE, "Invalid position error", e);
            System.out.println("Invalid position: " + e.getMessage());
        } catch (InvalidCommandException e) {
            LOGGER.log(Level.SEVERE, "Invalid command error", e);
            System.out.println("Invalid command: " + e.getMessage());
        } catch (MarsRoverException e) {
            LOGGER.log(Level.SEVERE, "An error occurred during the Mars Rover simulation", e);
            System.out.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "An unexpected error occurred", e);
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static Grid createGrid(Scanner scanner) throws MarsRoverException {
        System.out.print("Enter grid width: ");
        int width = scanner.nextInt();
        System.out.print("Enter grid height: ");
        int height = scanner.nextInt();
        
        if (width <= 0 || height <= 0) {
            throw new MarsRoverException("Grid dimensions must be positive. Width: " + width + ", Height: " + height);
        }
        
        try {
            return new Grid(width, height);
        } catch (IllegalArgumentException e) {
            throw new MarsRoverException("Error creating grid: " + e.getMessage());
        }
    }

    private static void addObstacles(Scanner scanner, Grid grid) {
        System.out.print("Enter number of obstacles: ");
        int numObstacles = scanner.nextInt();
        for (int i = 0; i < numObstacles; i++) {
            System.out.print("Enter obstacle " + (i + 1) + " position (x y): ");
            int obsX = scanner.nextInt();
            int obsY = scanner.nextInt();
            grid.addComponent(new Obstacle(new Position(obsX, obsY)));
        }
    }

    private static Rover createRover(Scanner scanner, Grid grid) throws InvalidPositionException {
        System.out.print("Enter rover starting position (x y): ");
        int startX = scanner.nextInt();
        int startY = scanner.nextInt();
        System.out.print("Enter rover starting direction (N, E, S, W): ");
        Direction direction;
        try {
            direction = Direction.valueOf(scanner.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InvalidPositionException("Invalid direction input: " + e.getMessage());
        }
        return new Rover(startX, startY, direction, grid);
    }

    private static List<Command> getCommands(Scanner scanner, Rover rover) throws InvalidCommandException {
        System.out.print("Enter commands (M, L, R) without spaces: ");
        String commandString = scanner.next();
        List<Command> commands = new ArrayList<>();
        for (char command : commandString.toCharArray()) {
            switch (command) {
                case 'M':
                    commands.add(new MoveCommand(rover));
                    break;
                case 'L':
                    commands.add(new TurnLeftCommand(rover));
                    break;
                case 'R':
                    commands.add(new TurnRightCommand(rover));
                    break;
                default:
                    throw new InvalidCommandException("Invalid command: " + command);
            }
        }
        return commands;
    }

    private static void executeCommands(List<Command> commands, Rover rover) throws MarsRoverException {
        for (Command command : commands) {
            command.execute();
        }
    }
}