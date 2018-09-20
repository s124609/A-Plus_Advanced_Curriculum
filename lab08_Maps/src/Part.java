public class Part implements Comparable<Part>
{
    private String make, mode, year, rest;

    public Part(String line)
    {
        String[] list = line.split(" ");

        int i = 0;
        while (!(Integer.parseInt(list[i]) > 0))
            rest += list[i++] + " ";

        make = list[i++];
        mode = list[i++];
        year = list[i++];
    }

    //have to have compareTo if implements Comparable
    public int compareTo( Part rhs )
    {





        return 0;
    }

    public String toString()
    {
        return make + " " + mode + " " + year + " " + rest;
    }
}