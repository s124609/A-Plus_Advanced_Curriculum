import java.lang.*;
import java.time.Duration;
import java.time.Instant;

public class Maze
{
    private int[][] maze;
    private boolean[][] pasable;
    private long start_time;

    Maze(boolean[][] m) {
        this.pasable = m;
        this.maze = new int[m.length][m.length];
        maze[9][5] = 647;
        start_time = System.nanoTime();
    }

    private boolean checkForExitPath(int r, int c) {

        if (r > -1 && c > -1 && r < this.pasable.length && c < this.pasable.length
                && maze[r][c] > -1 && this.pasable[r][c]) {
            if (maze[r][c] == 647) {
                return true;
            } else {
                this.maze[r][c] = -1;
                return this.checkForExitPath(r - 1, c) || this.checkForExitPath(r, c + 1)
                        || this.checkForExitPath(r + 1, c) || this.checkForExitPath(r, c - 1);
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String output;
        if (this.checkForExitPath(0, 0)) {
            output = "exit found\n";

            long end_time = System.nanoTime();
            double difference = (end_time - start_time) / 1e6;

            System.out.println(difference + "ms");
        } else {
            output = "exit not found\n";
        }

        for (int i = 0; i < maze.length; i++) {
            for (int x = 0; x < maze.length; x++)
                output += "" + maze[i][x];
            output += "\n";
        }

        return output;
    }
}
