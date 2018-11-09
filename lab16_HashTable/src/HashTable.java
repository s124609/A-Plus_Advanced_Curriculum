import java.io.File;
import java.util.*;
import static java.lang.System.*;

public class HashTable
{
    private LinkedList[] table;

    public HashTable(int size)
    {
        table = new LinkedList[size];
    }

    public void add(Number obj)
    {
        System.out.println("add");
        int i = obj.hashCode();

        if (table[i] == null)
            table[i] = new LinkedList();
        else
            table[i].push(obj);
    }

    public String toString()
    {
        String output="HASHTABLE\n";

        for (int i = 0; i < table.length; i++)
            for (int x = 0; x < table[i].size(); x++)
                output += table[i].get(x);
        return output;
    }
}