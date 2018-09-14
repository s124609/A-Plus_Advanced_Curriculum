import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("lab07_Sets/oddeven.dat"));

        do{
            OddEvenSets test = new OddEvenSets(file.nextLine());

            out.println(test);

        } while (file.hasNextLine());
    }
}