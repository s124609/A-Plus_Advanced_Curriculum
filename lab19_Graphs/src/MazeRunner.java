import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeRunner
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("lab19_Graphs/Maze.dat"));

        while(input.hasNextInt()) {
            int size = input.nextInt();
            int[][] maze = new int[size][size];
            System.out.println(size);

            for(int x = 0; x < size; ++x) {
                for(int y = 0; y < size; ++y) {
                    maze[x][y] = input.nextInt();
                    System.out.print(maze[x][y] + " ");
                }

                System.out.println();
            }

            Maze test = new Maze(maze);
            System.out.println(test);
        }

    }
}
