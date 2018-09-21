import static java.lang.System.*;

public class Part implements Comparable<Part>
{
    private String make, mode, year, rest;

    public Part(String line) {
        String[] list = line.split(" ");
        rest = "";

        int i = 0;
        while (i < list.length - 3)
        {
            rest += list[i++] + " ";
        }

        make = list[i++];
        mode = list[i++];
        year = list[i++];
    }

    //have to have compareTo if implements Comparable
    public int compareTo( Part rhs )
    {
        if (rhs.make.compareTo(this.make) != 0)
            return rhs.make.compareTo(this.make);
        if (rhs.mode.compareTo(this.mode) != 0)
            return rhs.mode.compareTo(this.mode);
        if (rhs.year.compareTo(this.year) != 0)
            return rhs.year.compareTo(this.year);
        if (rhs.rest.compareTo(this.rest) != 0)
            return rhs.rest.compareTo(this.rest);

        return 0;
    }

    public String toString()
    {
        return make + " " + mode + " " + year + " " + rest;
    }
}