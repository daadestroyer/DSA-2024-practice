import java.util.*;
import java.util.stream.Collectors;

public class App_test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 40, 10, 4);
        // List<Integer> collect = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).collect(Collectors.toList());

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }
}
