package lession9_condition.swich_case;

import java.util.Scanner;

public class lession {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int month = input.nextInt();

      switch (month) {
        case 1:
        case 2:
        case 3:
          System.out.println("First quater");
          break;
        case 4:
        case 5:
        case 6:
          System.out.println("Second quater");
          break;
        case 7:
        case 8:
        case 9:
          System.out.println("Third quater");
          break;
        case 10:
        case 11:
        case 12:
          System.out.println("Fourth quater");
          break;
        default:
          System.out.println("Input month invalid");
          break;
      }
    }

  }
}
