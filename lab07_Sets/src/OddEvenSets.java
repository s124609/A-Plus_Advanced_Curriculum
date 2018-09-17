import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
    private Set<Integer> odds;
    private Set<Integer> evens;

    public OddEvenSets()
    {
        odds = new TreeSet<>();
        evens = new TreeSet<>();
    }

    public OddEvenSets(String line)
    {
        odds = new TreeSet<>();
        evens = new TreeSet<>();

        for (String input : line.split(" "))
        {
            if (Integer.parseInt(input) % 2 == 0)
                evens.add(Integer.parseInt(input));
            else
                odds.add(Integer.parseInt(input));
        }
    }

    public String toString()
    {
        return "ODDS : " + odds.toString() + "\nEVENS : " + evens.toString() + "\n\n";
    }
}