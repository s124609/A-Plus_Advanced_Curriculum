import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeRunner
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("lab19_Graphs/passable.dat"));

        while (input.hasNextInt()) {
            int size = input.nextInt();
            int[][] maze = new int[size][size];
            System.out.println(size);

            for (int x = 0; x < size; ++x) {
                for (int y = 0; y < size; ++y) {
                    maze[x][y] = input.nextInt();
                    System.out.print(maze[x][y] + " ");
                }
                System.out.println();
            }


            boolean[][] passable = parseBoolean(maze);
            Maze test = new Maze(passable);
            System.out.println(test);
        }

    }

    private static boolean[][] parseBoolean(int[][] maze)
    {
        boolean[][] passable = new boolean[maze.length][maze.length];
        for (int i = 0; i < maze.length; i++) {
            for (int x = 0; x < maze.length; x++)
                if (maze[i][x] == 1)
                    passable[i][x] = true;
                else
                    passable[i][x] = false;
        }

        return passable;
    }
}
