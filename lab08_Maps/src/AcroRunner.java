import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("lab08_Maps/acro.dat"));
        Acronyms test = new Acronyms();

        for (int i = Integer.parseInt(file.nextLine()); i > 0; i--)
            test.putEntry(file.nextLine());

        do{
            out.println(test.convert(file.nextLine()));
        }while(file.hasNextLine());
    }
}