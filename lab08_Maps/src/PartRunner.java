import java.io.IOException;

import static java.lang.System.*;

public class PartRunner
{
    public static void main(String[] args) throws IOException
    {
        PartList test = new PartList("lab08_Maps/partinfo.dat");
        out.println(test);
        //Part temp = new Part("Water Pump 19934 Ford Taurus 1999");
        //out.println(temp);
    }
}
