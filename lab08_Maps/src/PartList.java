import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
    private TreeMap<Part, Integer> partsMap;

    public PartList()
    {
        partsMap = new TreeMap<>();
    }

    public PartList(String fileName)
    {
        this();
        try
        {
            Scanner file = new Scanner(new File("lab08_Maps/partinfo.dat"));
            //add code here to read from the file
            //and add Parts to the map
            Part key = new Part(file.nextLine());
            partsMap.put(key, 1);
        }
        catch( IOException e )
        {
            out.println(e);
        }
        catch( RuntimeException e )
        {
            out.println(e);
        }
        catch( Exception e )
        {
            out.println(e);
        }
        finally {}
    }

    public String toString()
    {
        String output="";




        return output;
    }
}