# DSA-2024-practice

#### How to sort hashmap based on values
````
HashMap<Integer, Integer> map = new HashMap<>();
hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));

Converting HashMap to stream take : O(N)
Stream and Collecting : O(N)
so it takes O(N)
````

#### Using collectors.toCollection(ArrayList::new) to get ArrayList<Integer> and not List
````
ArrayList<Integer> list = new ArrayList<>();
ArrayList<Integer> collect = list.stream().collect(Collectors.toCollection(ArrayList::new));
````

#### Convert TreeSet to ArrayList
````
TreeSet<Integer> ts = new TreeSet<Integer>();
ArrayList<Integer> res = ts.stream.collect(Collectors.toCollection(ArrayList::new));
````
