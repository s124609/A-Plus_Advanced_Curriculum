import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
    public static Set<String> getUniques(String input)
    {
        Set<String> uniques = new TreeSet<>();

        for (String add : input.split(" "))
        {
            if (!uniques.contains(add))
                uniques.add(add);
        }

        return uniques;
    }

    public static Set<String> getDupes(String input)
    {
        Set<String> uniques = new TreeSet<>();
        Set<String> dupes = new TreeSet<>();

        for (String raw : input.split(" "))
        {
            if (!uniques.add(raw))
                dupes.add(raw);
        }

        return dupes;
    }
}