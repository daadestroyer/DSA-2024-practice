package Arrays_06.Basic;

public class App04_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        while(fast < nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            else{
                fast++;
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
