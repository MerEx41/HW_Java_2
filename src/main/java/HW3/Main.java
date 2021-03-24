package HW3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>(Arrays.asList(
                "Duplex","Flat","Hut","Castle","Wigwam",
                "Skyscraper","Wigwam","Flat","Duplex","Tent",
                "Castle","Skyscraper","Hut","Tent","Castle",
                "Skyscraper","Flat","Duplex","Wigwam","Hut"));

        Set<String> unique = new HashSet<String>(words);

        System.out.println("\nUnique words");
        System.out.println(unique);
        System.out.println("\nWords frequency");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        System.out.println("\nTest Phonebook");

        Phonebook testPhonebook = new Phonebook();

        testPhonebook.add(1111111, "First");
        testPhonebook.add(2222222, "Second");
        testPhonebook.add(3333333, "Third");
        testPhonebook.add(4444444, "Second");
        testPhonebook.add(5555555, "First");

        testPhonebook.get("First");
        testPhonebook.get("Second");
    }
}
