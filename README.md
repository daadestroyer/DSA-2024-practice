# DSA-2024-practice

#### How to sort hashmap based on values
````
1. Sorting ascending order
HashMap<Integer, Integer> map = new HashMap<>();
hm.entrySet().stream().sorted((e1,e2)->e1.getValue()-e2.getValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));

2. Sorting descending order
hm.entrySet().stream().sorted((e1,e2)->e2.getValue()-e1.getValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
Converting HashMap to stream take : O(N)
Stream and Collecting : O(N)
so it takes O(N)
````

#### Convert TreeSet to ArrayList
````
TreeSet<Integer> ts = new TreeSet<Integer>();
ArrayList<Integer> res = ts.stream.collect(Collectors.toCollection(ArrayList::new));
````

0-1 Knapsack
------------
1. Subset sum
2. Equal sum partition
3. Count of subset sum
4. Minimum subset sum diff
5. Number of subset with given diff

Unbound Knapsack
------------------
1. Rod Cutting
2. Coin Change 1
3. Coin Change 2
4. Maximum Ribbon Cut

Longest Common Sub Sequence
---------------------------
1. Largest Common Substring
2. print LCS
3. Shortest common super sequence
4. Minimum insertion and deletion
5. print SCS
6. Largest repeating subsequence
7. Length of largest subsequence of a which substring is b
8. Subsequence patterns for matching
9. Count how many times 'a' appears as sub sequence in b
10. Longest pallindromic subsequence
11. Longest pallindromic substring
12. Count of pallindromic substring
13. Min deletion in a to make it pallindrome
14. Min insertion in a to make it pallindrome

Sequence-- i- maintain order


Matrixchain multiplication
---------------------------
1. Print MCM
2. MCM
3. Evaluate Expn to boolean paranthesis
4. Min/Max value of Expn
5. Pallindromic String
6. Scrample String
7. Egg Dropping Problem

