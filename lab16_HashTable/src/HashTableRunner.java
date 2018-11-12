import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;


public class HashTableRunner {
    public static void main(String[] args) throws IOException {
        // Number
        Scanner file = new Scanner(new File("lab16_HashTable/numbers.dat"));
        HashTableNumber numbers = new HashTableNumber(); file.nextInt();

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

        // Word
        file = new Scanner(new File("lab16_HashTable/words.dat"));
        HashTableWord words = new HashTableWord(); file.nextLine();

        do {
            try {
                Word nextWord = new Word(file.nextLine());
                words.add(nextWord);
            }
            catch (Exception e) {
                System.out.println(e);
            }

        } while (file.hasNextLine());
        out.println(words);
    }
}