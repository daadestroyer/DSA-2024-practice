import java.util.*;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        int k = 2;
        hm.put(0, 1);
        int sum = 0;
        sum += nums[0];
        res += hm.get(0);
        System.out.println(res);
        System.out.println(hm);
    }


}
