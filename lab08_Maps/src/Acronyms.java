import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
    private Map<String,String> acronymTable;

    public Acronyms()
    {
        acronymTable = new HashMap<>();
    }

    public void putEntry(String entry)
    {
        acronymTable.put(entry.substring(0,entry.indexOf("-") - 1),
                entry.substring(entry.indexOf("-") +2 ));
    }

    public String convert(String sent)
    {
        Scanner chop = new Scanner(sent);
        String output ="";

        do{
            String next = chop.next();

            if (next.indexOf('.') >= 0)
            {
                next = next.substring(0, next.indexOf('.'));
                output += acronymTable.getOrDefault(next, next) + ". ";
            }
            else
                output += acronymTable.getOrDefault(next, next) + " ";

        }while(chop.hasNext());

        return output;
    }

    public String toString()
    {
        return acronymTable + "\n";
    }
}