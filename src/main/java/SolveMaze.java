import edu.illinois.cs.cs125.lib.mazemaker.Maze;

/**
 * Solve a randomly-generated maze.
 *
 * @see <a href="https://github.com/cs125-illinois/mazemaker">Mazemaker on GitHub</a>
 * @see <a href="https://cs125-illinois.github.io/mazemaker/">Mazemaker Documentation</a>
 * @see <a href="https://cs125.cs.illinois.edu/lab/2/#maze">Lab 2 Writeup</a>
 */
/**
 *
 canMove(): returns true if you can move forward
 move(): moves you one square forward, if possible; otherwise does nothing
 turnRight(): turns right, does not change your position
 turnLeft(): turns left, does not change your position
 isFinished(): returns true when you have reached the end
 */

/**
 *
 */
public class SolveMaze {


    /**
     * Implement your maze solving algorithm in the main method below.
     *
     * @param unused unused input arguments
     */

    public static void main(final String[] unused) {
        /*
         * Create a new 10 x 10 maze. Feel free to change these values.
         */
        Maze maze = new Maze(10, 10);

        /*
         * Pick (0, 0), the bottom left corner, as the starting point.
         * Put the end in the top right corner.
         */
        maze.startAtZero();
        maze.endAtTopRight();

        /*
         * You should be able to solve a 10 x 10 maze in (far fewer than) 1000 steps.
         * Feel free to adjust this number if you experiment with other mazes.
         */
        /* Move forward until it cannot move anymore.
         * Then turn right, if works, keep going; If not, turn left and left. Keep trying different paths until all the paths have been gone through. If it still doesn’t work, go back to the original position.
         * Since the previous path doesn’t work eventually,
         * We try another a different path.
         * Turn right on the original position and do the same things stated above.
         * Keep turning right until you find a way to the end.
         */
        for (int step = 0; step < 1000; step++) {
            maze.move();
            // Implement your maze solving algorithm here
            if (maze.isFinished() == false) {
                if (maze.canMove() == false) {
                    maze.turnRight();
                    continue;
                }
            } else {
                break;
            }
            if (maze.isFinished()) {
                System.out.println("You solved the maze!");
            } else {
                System.out.println("Try again!");
            }
        }
    }
