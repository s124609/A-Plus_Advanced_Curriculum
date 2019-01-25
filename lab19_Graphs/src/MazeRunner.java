import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeRunner
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("lab19_Graphs/Passable.dat"));

        while (input.hasNextInt()) {
            int size = input.nextInt();
            Boolean[][] maze = new Boolean[size][size];
            System.out.println(size);

            for (int x = 0; x < size; ++x) {
                for (int y = 0; y < size; ++y) {
                    maze[x][y] = input.nextBoolean();
                    System.out.print(maze[x][y] + " ");
                }
                System.out.println();
            }


            int[][] passable = parseBoolean(maze);
            Maze test = new Maze(passable);
            System.out.println(test);
        }

    }

    private static int[][] parseBoolean(Boolean[][] maze)
    {
        int[][] passable = new int[maze.length][maze.length];
        for (int i = 0; i < maze.length; i++) {
            for (int x = 0; x < maze.length; x++)
                if (maze[i][x])
                    passable[i][x] = 1;
                else
                    passable[i][x] = 0;
        }

        return passable;
    }
}
