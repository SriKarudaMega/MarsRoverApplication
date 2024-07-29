# Mars Rover Application
## Overview
The Mars Rover Application simulates the operations of a Mars rover navigating a grid-based terrain. The application allows users to define a grid, place obstacles, and control a rover using simple commands. This project demonstrates the rover's movement capabilities and its ability to handle obstacles on a grid.

## Features

**Grid Creation:** Create a grid with specified width and height. Grid dimensions must be positive integers.

**Obstacle Placement:** Place obstacles at specified coordinates on the grid. The rover cannot move through these obstacles.

**Rover Initialization:** Initialize the rover's starting position and direction.

**Command Execution:** 

**Issue commands to the rover:**

**Move (M):** Move the rover one step forward in the current direction.

**Turn Left (L):** Rotate the rover 90 degrees to the left.

**Turn Right (R):** Rotate the rover 90 degrees to the right.

**Position Validation:** Ensure rover movements are within grid boundaries and do not collide with obstacles.

## Usage
**Create a Grid:**

Enter the width and height of the grid.

**Add Obstacles:**

Specify the number of obstacles and their positions.

**Initialize the Rover:**

Provide the rover’s starting position and direction.

**Enter Commands:**

Input a sequence of commands (M, L, R) for the rover to execute.

**View Status:**

The application will display the rover's final position and direction after executing the commands.

## Example

Here’s an example of how to use the application:

**Grid:** 5x5

**Obstacles:** (1,1), (2,2)

**Rover Starting Position:** (0,0), Direction: North

**Commands:** MMRMMR

## Documentation

The Javadoc for this project can be found file [here](https://github.com/SriKarudaMega/MarsRoverApplication.git/src/index.html)
