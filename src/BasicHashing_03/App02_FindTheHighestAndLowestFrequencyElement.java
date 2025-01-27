package BasicHashing_03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App02_FindTheHighestAndLowestFrequencyElement {

    static void withoutJava8(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        // sort based on values
        List<Map.Entry<Integer, Integer>> entries = hm.entrySet().stream().collect(Collectors.toList());

        // sort the list based on values
        entries.sort(Map.Entry.comparingByValue());

        // store all the key and values back to map
        LinkedHashMap<Integer, Integer> sortedMapByValue = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entries) {
            sortedMapByValue.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMapByValue);
        System.out.println("Least No : " + sortedMapByValue.entrySet().stream().findFirst().get().getKey());
        System.out.println("Most freq : " + sortedMapByValue.entrySet().stream().skip(sortedMapByValue.size() - 1).findFirst().get().getKey());

    }

    public static void withJava8(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : arr) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }
        LinkedHashMap<Integer, Integer> linkedHashMap = hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(linkedHashMap);
        System.out.println("Least No : " + linkedHashMap.entrySet().stream().findFirst().get().getKey());
        System.out.println("Most freq : " + linkedHashMap.entrySet().stream().skip(linkedHashMap.size() - 1).findFirst().get().getKey());
    }

    public static void main(String[] args) {
        int array[] = {10, 5, 10, 15, 10, 5, 1};

        //  withoutJava8(array);
        withJava8(array);

//        for (int i : array) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        System.out.println("treemap : " + map);
//        //  Map<Integer, Integer> newmap = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
//        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
//         System.out.println("Most Least No : " + sortedMap.keySet().stream().findFirst().get());
//         System.out.println("Most Frequent No " + sortedMap.keySet().stream().skip(sortedMap.size() - 1).findFirst().get());

    }
}
