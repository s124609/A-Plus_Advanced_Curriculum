import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;


public class HashTableRunner {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("lab16_HashTable/numbers.dat"));
        HashTable numbers = new HashTable(); file.nextInt();

        do {
            try {
                Number next = new Number(file.nextInt());
                numbers.add(next);
            }
            catch (Exception e) {
                System.out.println(e);
            }

        } while (file.hasNextInt());
        out.println(numbers);
    }
}