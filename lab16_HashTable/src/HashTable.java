import java.io.File;
import java.util.*;
import static java.lang.System.*;

public class HashTable
{
    private LinkedList[] table;

    public HashTable()
    {
        table = new LinkedList[10];
    }

    public void add(Number obj)
    {
        int i = obj.hashCode();

        if (table[i] == null)
            table[i] = new LinkedList();

        table[i].push(obj);

    }

    public String toString()
    {
        String output="HASHTABLE\n";

        for (int i = 0; i < table.length; i++) {
            output += "bucket ";
            for (int x = 0; x < table[i].size(); x++)
                output += table[i].get(x) + " ";
            output += "\n";
        }
        return output;
    }
}