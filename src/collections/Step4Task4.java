package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Step4Task4 {
    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("abc", "value1");
        inputMap.put("abcd", "value2");
        inputMap.put("abcde", "value3");
        inputMap.put("abcdef", "value4");

        Map<String, String> sortedMap = getSortedMap(inputMap);
        System.out.println(sortedMap);
    }

    public static Map<String, String> getSortedMap(Map<String, String> inputMap) {
        Map<String, String> threeCharMap = new TreeMap<>();

        for (Map.Entry<String, String> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.length() == 3) {
                threeCharMap.put(key, value);
            }
        }

        return threeCharMap;
    }
}
