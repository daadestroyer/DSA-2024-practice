package Strings_07.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class App01_SortCharactersByFrequency_451 {
    public static void main(String[] args) {
        String s = "Aabb";
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        // Step 2: Sort characters by frequency
        map = map
                .entrySet()
                .stream()
                .sorted((e1,e2)->e2.getValue()-e1.getValue())
                .collect
                        (Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

         System.out.println(map);
        // Step 3: Build the output string
        StringBuffer sb = new StringBuffer();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();
            for (int i = 0; i < val; i++) {
                sb.append(key);
            }
        }
        System.out.println(sb.toString());
    }
}
