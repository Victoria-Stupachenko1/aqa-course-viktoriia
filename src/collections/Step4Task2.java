package collections;

import java.util.HashMap;
import java.util.Map;

public class Step4Task2 {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();

        userMap.put(1, "Anna");
        userMap.put(2, "Brad");
        userMap.put(3, "Carlos");
        userMap.put(4, "Daria");
        userMap.put(5, "Evelina");

        // Users with even IDs
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();

            if (id % 2 == 0) {
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
    }
}

