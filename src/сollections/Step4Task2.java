package сollections;

import java.util.HashMap;
import java.util.Map;

public class Step4Task2 {
    private int id;
    private String name;

    public Step4Task2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Map<Integer, Step4Task2> userMap = new HashMap<>();

        // Create User objects and add them to the map
        Step4Task2 user1 = new Step4Task2(1, "John");
        Step4Task2 user2 = new Step4Task2(2, "Alice");
        Step4Task2 user3 = new Step4Task2(3, "Bob");
        Step4Task2 user4 = new Step4Task2(4, "Emily");

        userMap.put(user1.getId(), user1);
        userMap.put(user2.getId(), user2);
        userMap.put(user3.getId(), user3);
        userMap.put(user4.getId(), user4);

        System.out.println("Users with even ID:");
        for (Map.Entry<Integer, Step4Task2> entry : userMap.entrySet()) {
            int id = entry.getKey();
            Step4Task2 user = entry.getValue();

            if (id % 2 == 0) {
                System.out.println("ID: " + id + ", Name: " + user.getName());
            }
        }
    }
}

