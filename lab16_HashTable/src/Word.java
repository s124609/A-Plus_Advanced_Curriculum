import java.io.File;
import java.util.*;
import static java.lang.System.*;

public class Word
{
    private String theValue;
    private Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public Word (String word)
    {
        theValue  = word;
    }

    public String getTheValue ()
    {
        return this.theValue;
    }

    public boolean equals (Word obj)
    {
        return this.theValue.equals(obj.theValue);
    }

    public int hashCode ()
    {
        int number = 0;
        for (int i = 0; i < theValue.length(); i++)
            for (Character test : vowels) {
                if (theValue.charAt(i) == test)
                    number++;
            }
        return (number * theValue.length()) % 10;
    }

    public String toString()
    {
        return getTheValue();
    }
}