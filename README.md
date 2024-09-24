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
