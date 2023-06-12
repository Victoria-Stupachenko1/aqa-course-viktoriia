package collections;

import java.util.*;

public class Step4Task3 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("Olya", "Natasha", "Polina", "Vlad"));
        List<String> stringList = Arrays.asList("Bohdan", "Oleksandr", "Vlad", "Natasha");

        Set<String> combinedCollection = new HashSet<>();
        combinedCollection.addAll(stringSet);
        combinedCollection.addAll(stringList);

        System.out.println("Values of the combined collection:");
        for (String value : combinedCollection) {
            System.out.println(value);
        }
    }
}
