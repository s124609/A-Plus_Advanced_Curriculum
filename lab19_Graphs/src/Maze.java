public class Maze
{
    private int[][] maze;

    Maze(int[][] m) {
        this.maze = m;
    }

    private boolean checkForExitPath(int r, int c) {
        if (r > -1 && c > -1 && r < this.maze.length && c < this.maze.length && this.maze[r][c] == 1) {
            this.maze[r][c] = -1;
            if (c == this.maze.length - 1) {
                return true;
            } else {
                return this.checkForExitPath(r - 1, c) || this.checkForExitPath(r, c + 1) || this.checkForExitPath(r + 1, c) || this.checkForExitPath(r, c - 1);
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String output;
        if (this.checkForExitPath(0, 0)) {
            output = "exit found\n";
        } else {
            output = "exit not found\n";
        }

        return output;
    }
}
