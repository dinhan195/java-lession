package lession13_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practice2 {

  static void getByKeySet(HashMap<String, Integer> people) {

    System.out.println("SetKey(): " + people.keySet());
    System.out.println("Value(): " + people.values());

    for (String i : people.keySet()) {
      System.out.println("Key: " + i + " Value: " + people.get(i));
    }

    System.out.println(people);

  }

  static void getEntrySet(HashMap<String, Integer> people) {
    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    System.out.println("entrySet" + entrySet);
    System.out.println("Length: " + entrySet.size());
    for (Map.Entry<String, Integer> entry : entrySet) {
      System.out.println(entry);
      System.out.println(entrySet);
      // System.out.println("Key - Value: " + entry.getKey() + " - " +
      // entry.getValue());
    }
  }

  public static void main(String[] args) {

    HashMap<String, Integer> people = new HashMap<>();

    people.put("John", 32);
    people.put("Steve", 22);
    people.put("Angie", 28);

    // practice2.getByKeySet(people);

    practice2.getEntrySet(people);

  }
}
