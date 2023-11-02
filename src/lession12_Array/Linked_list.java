package lession12_Array;

import java.util.LinkedList;

public class Linked_list {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();

    // Add element to array

    names.add("hey");

    // Add last element to array

    names.offer("Anna");

    // Remove fist element of array
    names.poll();

    names.addFirst("John");
    names.addLast("Hey");
  }

}
