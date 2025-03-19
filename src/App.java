import java.util.*;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        int[] ints = Arrays.stream(integers).mapToInt(i -> i).toArray();
    }


}
