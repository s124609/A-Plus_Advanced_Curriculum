import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
    public static void main( String args[] )
    {
        String input = "A B C D E F G H I J K A E E L M N O P M H";
        UniquesDupes test = new UniquesDupes();

        out.println("Original List :: " + input);
        out.println("Uniques :: " + test.getUniques(input).toString());
        out.println("Dupes :: " + test.getDupes(input).toString() + "\n");

        input = "1 1 9 8 6 5 9 2 3 0 2 8 4 3 1 2";

        out.println("Original List :: " + input);
        out.println("Uniques :: " + test.getUniques(input).toString());
        out.println("Dupes :: " + test.getDupes(input).toString() + "\n");

    }
}