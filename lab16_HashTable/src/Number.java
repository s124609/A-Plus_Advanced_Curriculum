import java.io.File;
import java.util.*;
import static java.lang.System.*;

public class Number
{
    private int theValue;

    public Number(int value)
    {
        theValue = value;
    }

    public int getValue()
    {
        return theValue;
    }

    public boolean equals(Number obj)
    {
        return this.theValue == obj.theValue;
    }

    public int hashCode()
    {
        return theValue % 10;
    }

    public String toString()
    {
        return "";
    }
}