import java.util.*;
import java.util.stream.Collectors;


class Employee{

}
public class Main {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 20, 200, 100, 100, 200, 4, 1, 3, 5, 2, 4, 6, 10, 6, 10, 1, 2, 3);
        Map<Integer, Long> ans1 = list.stream().collect(Collectors.groupingBy(no -> no, Collectors.counting()));
        TreeMap<Integer, Long> ans2 = list.stream().collect(Collectors.groupingBy(no -> no, TreeMap::new, Collectors.counting()));

        System.out.println(ans1);
        System.out.println(ans2);

    }


}