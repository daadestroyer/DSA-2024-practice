package DynamicProgramming_15.DP_On_SubSequences_03;

public class App06_CoinChange_322 {
    public static void main(String[] args) {
        /*
         Time Complexity:
         ----------------
         -- iterating complete array = O(n)
         -- iterating till amount becomes 0 = O(amount)
            TC : O(n * amount)

         Space Complexity:
         ----------------
         dp array -- O(amount)
         recursion stack -- worst case = amount (e.g., if coins = [1], recursion subtracts 1 each step). O(amount)

         SC : O(amount)
        */
    }
}
