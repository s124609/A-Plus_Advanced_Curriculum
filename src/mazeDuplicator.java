import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class mazeDuplicator
{
    public static void main(String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("lab19_Graphs/passable.dat"));

        int size = file.nextInt();
        StringBuilder maze = new StringBuilder();

        do {
            String line = file.nextLine();
            maze.append(line).append(" ").append(line).append("\n");

            size--;

        } while (size > 0);

        out.print(maze);
        out.println(maze);

    }
}