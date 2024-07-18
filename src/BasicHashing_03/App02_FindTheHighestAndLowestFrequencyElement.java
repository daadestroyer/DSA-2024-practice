package BasicHashing_03;

import java.util.*;
import java.util.stream.Collectors;

public class App02_FindTheHighestAndLowestFrequencyElement {
    public static void main(String[] args) {
        int array[] = {10, 5, 10, 15, 10, 5,1};
        HashMap<Integer, Integer> map = new HashMap<>();


        Arrays.stream(array).sorted().toArray();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        // Map<Integer, Integer> newmap = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("Most Least No : "+sortedMap.keySet().stream().findFirst().get());
        System.out.println("Most Frequent No "+sortedMap.keySet().stream().skip(sortedMap.size()-1).findFirst().get());


        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>(map);
        System.out.println(lhm);

    }
}
