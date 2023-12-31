package review2.hashAndTreeSetMap;


import java.util.*;

public class D4TestHashMapAndTreeMap {
  public static void main(String[] args) {
    // Create a HashMap
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Smith", 30);
    hashMap.put("Anderson", 31);
    hashMap.put("Lewis", 29);
    hashMap.put("Cook", 29);

    System.out.println("Display entries in HashMap: ===");
    System.out.println(hashMap + "\n");

    // Create a TreeMap from the preceding HashMap
    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
    System.out.println("\nDisplay entries in ascending order of key (TreeMap): ===");
    System.out.println(treeMap);

    // Display each entry with name and age
    System.out.print("\nLooping through each entry (TreeMap) ==== ");
    treeMap.forEach(
      (name, age) -> System.out.print(name + ": " + age + " "));
    
    // Create a LinkedHashMap
    Map<String, Integer> linkedHashMap =
      new LinkedHashMap<>(16, 0.75f, true);
    linkedHashMap.put("Smith", 30);
    linkedHashMap.put("Anderson", 31);
    linkedHashMap.put("Lewis", 29);
    linkedHashMap.put("Cook", 29);

    System.out.println("\n\nDisplay entries in LinkedHashMap (Maintains the order of adding elements): ===");
    System.out.println(linkedHashMap);
    

    // Display the age for Lewis
    System.out.println("\nThe age for " + "Lewis is " +
      linkedHashMap.get("Lewis"));
  }
}
