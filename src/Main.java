import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Main {


    public static void main(String[] args) {
        List<String> names = List.of("Ram Shyam", "Laxman Bharath", "Shatrughan Arjun");
        List<String> names1 = List.of("Ram ", " Bharath", " Arjun");
        List<List<String>> names2 = List.of(
                List.of("Ram"),
                List.of("Laxman"),
                List.of("Bharath"),
                List.of("Shatrughan"));

        List<Employee> names3 = List.of(new Employee("Ram", 1000), new Employee("Shyam", 2000), new Employee("Laxman", 3000));

        // List<String> collect = names1.stream().flatMap(s -> Arrays.stream(s.split(""))).collect(Collectors.toList());

        // List<String> collect = names2.stream().flatMap(List::stream).collect(Collectors.toList());

        // List<Integer> collect = names2.stream().flatMap(List::stream).map(s -> s.length()).collect(Collectors.toList());

        // int sum = names3.stream().map(emp -> emp.salary).mapToInt(Integer::intValue).sum();

        List<List<String>> fruits = List.of(
                List.of("apple", "banana"),
                List.of("banana", "mango"),
                List.of("mango", "pears")
        );

        // List<Integer> nos = List.of(10, 14, 10, 24, 20);
        // List<String> collect = fruits.stream().flatMap(List::stream).distinct().collect(Collectors.toList());

        // List<Integer> collect = nos.stream().distinct().collect(Collectors.toList());


        List<Integer> nums = List.of(30, 34, 34, 20, 20, 10, 1, 2, 100, 1, 3);

        Map<Integer, Long> collect = nums
                .stream()
                .collect(Collectors.groupingBy(a -> a, TreeMap::new, Collectors.counting()));
        System.out.println(collect);  // {1=2, 2=1, 3=1, 10=1, 20=2, 30=1, 34=2, 100=1}

    }
}