package lession9_condition;

import java.util.Scanner;

public class practice2 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int month = input.nextInt();

      System.out.println("Input month: " + month);

      if ((month >= 1) && (month <= 3)) {
        System.out.println("First quater");
      } else if (month >= 4 && month <= 6) {
        System.out.println("Second quater");

      } else if (month >= 7 && month <= 9) {
        System.out.println("Thirt quater");
      } else if (month >= 10 && month <= 12) {
        System.out.println("Fourth quater");
      } else {
        System.out.println("Input month not valid");
      }
    }
  }
}
