package Arrays_06.Basic;

public class App09_MaximumConsecutiveOnes_485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int maxConsecutiveOnes = 0;
        int consecutiveOnes = 0;

        for(int i : nums){
            if(i == 1){
                consecutiveOnes++;
                maxConsecutiveOnes = Math.max(consecutiveOnes,maxConsecutiveOnes);
            }
            else{
                maxConsecutiveOnes = Math.max(consecutiveOnes,maxConsecutiveOnes);
                consecutiveOnes = 0;
            }
        }
        System.out.println(maxConsecutiveOnes);
    }
}
