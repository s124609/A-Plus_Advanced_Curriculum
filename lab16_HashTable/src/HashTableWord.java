import java.io.File;
import java.util.*;
import static java.lang.System.*;

public class HashTableWord
{
    private LinkedList[] table;

    public HashTableWord()
    {
        table = new LinkedList[10];
    }

    public void add(Word obj)
    {
        int i = obj.hashCode();

        if (table[i] == null)
            table[i] = new LinkedList();

        table[i].push(obj);

    }

    public String toString()
    {
        String output="HASHTABLE WORD\n";

        for (int i = 0; i < table.length; i++) {
            output += "bucket " + i + " ";
            if (table[i] != null)
            {
                for (int x = 0; x < table[i].size(); x++)
                    output += table[i].get(x) + " ";
            }
            output += "\n";
        }
        return output;
    }
}