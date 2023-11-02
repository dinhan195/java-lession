package lession12_Array;

import java.util.HashSet;

public class Hash_set {
  public static void main(String[] args) {
    HashSet<Integer> numSetOne = new HashSet<>();

    numSetOne.add(1);
    numSetOne.add(2);
    numSetOne.add(3);
    numSetOne.add(4);
    System.out.println(numSetOne);

    HashSet<Integer> numSetTwo = new HashSet<>();

    numSetTwo.add(3);
    numSetTwo.add(4);
    numSetTwo.add(5);
    numSetTwo.add(5);

    System.out.println(numSetTwo);

    // Join 2 hashset

    // numSetOne.addAll(numSetTwo);
    // System.out.println("AddAll: " + numSetOne); // ==> [1,2,3,4,5]

    // numSetOne.retainAll(numSetTwo);
    // System.out.println("remainAll" + numSetOne); // ==> [3,4]

    numSetOne.removeAll(numSetTwo);
    System.out.println(numSetOne); // ==> [1,2]

  }
}
