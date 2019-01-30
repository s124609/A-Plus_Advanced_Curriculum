import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class mazeDuplicator
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("lab19_Graphs/test.dat"));

        int size = file.nextInt();
        StringBuilder maze = new StringBuilder();

        while (size > 0) {
            maze.append("\n");
            String line = file.nextLine();
            maze.append(line).append(" ").append(line);

            size--;
        }

        out.print(maze);
        out.println(maze);

    }
}