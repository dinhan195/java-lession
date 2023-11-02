package lession12_Array;

import java.util.ArrayList;

public class Array_list {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    // Add elaments to Array
    names.add("John");
    names.add("Jack");
    names.add("Anna");

    // Add element to index

    names.add(1, "Hey");

    System.out.println("Add: " + names);

    // Update array

    names.set(1, "Hello");

    System.out.println("Updated: " + names);

    // Get element array

    System.out.println("Get element: " + names.get(0));

    // Remove element

    names.remove(1);
    System.out.println("Remove element in Array: " + names);

    // Check element contains in array

    boolean check = names.contains("John");
    System.out.println(check);

  }
}
