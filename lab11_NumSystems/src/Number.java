import static java.lang.System.*;

public class Number implements Comparable<Number>
{

    //add in instance variables
    private int orig, base, base10, count;
    private String binary;

    //add in a constructor or two
    public Number()
    {
        orig = base = base10 = count = 0;
        binary = "";
    }

    public Number (int one, int two)
    {
        orig = one; base = two; count = 0;
        base10 = Integer.parseInt("" + orig, base);
        binary = Integer.toString(base10, 2);

        for (int i = 0; i < binary.length(); i++)
            if (binary.substring(i,i+1).equals("1"))
                count++;
    }

    public int compareTo(Number param)
    {
        return param.count - this.count;
    }

    public String toString( )
    {
        return "" + orig  + " " + base10 + " " + binary;
    }
}