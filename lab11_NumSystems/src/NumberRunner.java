import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class NumberRunner
{
    public static void main ( String[] args ) throws IOException
    {
        Scanner file = new Scanner(new File("lab11_NumSystems/number.dat"));
        Set<Number> list = new TreeSet<>(new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                return o1.compareTo(o2);
            }
        });

        int param = Integer.parseInt(file.nextLine());

        for (int i = 0; i < param; i++)
        {
            String line = file.nextLine();
            Number test = new Number(Integer.parseInt(line.substring(0,line.indexOf(' '))),
                    Integer.parseInt(line.substring(line.indexOf(' ') + 1)));
            list.add(test);
        }

        for (Number temp : list)
        {
            out.println(temp);
        }
    }
}