package Arrays_06.Medium;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class App04_MajorityElementGreaterByNBy2 {
    static int bruteForce(int[] nums){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > nums.length /2){
                return entry.getKey();
            }
        }
        return 0;
    }

    static int optimizedApproach(int[] nums) {
        int storedElement = 0;
        int count = 0;
        for(int i : nums){
            if(count == 0){
                storedElement = i;
                count++;
            }
            if(i == storedElement){
                count++;
            }
            else{
                count--;
            }
        }
        return storedElement;
    }
    public static void main(String[] args) {
        int[] nums  ={3,2,3};
//        System.out.println(bruteForce(nums));
        System.out.println(optimizedApproach(nums));
    }


}
