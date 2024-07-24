import java.util.*;
import java.util.stream.Collectors;

interface i1{
    default void m1(){
        System.out.println("m1 default");
    }
    static void m2(){
        System.out.println("m2 static");
    }
}

class myclass implements i1{

}
public class App{
    public static void main(String[] args) {
        Map<String, Integer> employeeSalaries = new HashMap<>();
        employeeSalaries.put("Alice", 50000);
        employeeSalaries.put("Bob", 70000);
        employeeSalaries.put("Charlie", 60000);
        employeeSalaries.put("David", 70000); // Duplicate salary
        employeeSalaries.put("Ravi", 40000);
        employeeSalaries.put("Dubey", 90000); // Duplicate salary

        int n= 1;
//        findNthHighestSal(n,employeeSalaries);
        List<Integer> collect = employeeSalaries.values().stream().sorted().collect(Collectors.toList());

        System.out.println(collect);

        Integer integer = employeeSalaries.values().stream().distinct().sorted().skip(n - 1).findFirst().orElse(null);

//        System.out.println(integer);

        Map.Entry<String, Integer> stringIntegerEntry = employeeSalaries.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(n-1);
        System.out.println(stringIntegerEntry);

        System.out.println(2%4);
    }

    private static void findNthHighestSal(int n, Map<String, Integer> employeeSalaries) {
        TreeSet<Integer> uniqueSal = new TreeSet<>();
        uniqueSal.addAll(employeeSalaries.values());
        System.out.println(uniqueSal);
        if(uniqueSal.size() < n){
            System.out.println("no unique sal");
        }
        else{
            ArrayList<Integer> arrayList = new ArrayList<>(uniqueSal);
            System.out.println(arrayList.get(n-1));
        }
    }
}
