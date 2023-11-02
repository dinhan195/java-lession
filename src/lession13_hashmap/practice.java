package lession13_hashmap;

import java.util.HashMap;

public class practice {
  public static void main(String[] args) {
    HashMap<Integer, String> names = new HashMap<>();

    // Add elemant to names with each value has its key
    names.put(1, "John");
    names.put(2, "Jack");

    System.out.println("Add by method put(): " + names);

    // Get element by key

    names.get(1);
    System.out.println("Get element by key=1: " + names.get(1));

    // Delete element by key
    // names.remove(1);
    // System.out.println("Delete element by key: " + names);

    // Update element by key and value
    names.replace(1, "Hellol");

    System.out.println(names);


  }
}
