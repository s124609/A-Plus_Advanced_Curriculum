import java.io.File;
import java.io.IOException;
import java.util.Comparator;
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

    public PartList(String fileName) throws IOException
    {
        partsMap = new TreeMap<>(new Comparator<Part>() {
            @Override
            public int compare(Part o1, Part o2) {
                return o1.compareTo(o2);
            }

        });

        try {
            Scanner file = new Scanner(new File(fileName));

            do {
                Part key = new Part(file.nextLine());

                if (partsMap.containsKey(key))
                    partsMap.replace(key, partsMap.get(key) + 1);
                else
                    partsMap.put(key, 1);
            } while (file.hasNextLine());

        }

        catch (NullPointerException e) { out.println(e); }
    }

    public String toString()
    {
            String output = "";
            for (Part temp : partsMap.keySet()) {
                output = temp.toString() + partsMap.get(temp) + "\n" + output;
            }

            return output;
    }
}