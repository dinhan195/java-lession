package lession9_condition.swich_case;

import java.util.Scanner;

public class prctice1 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int userInput = input.nextInt();

      switch (userInput) {
        case 1:
          System.out.println("Search ly name");
          break;
        case 2:
          System.out.println("Search by outhor");
          break;
        case 3:
          System.out.println("Search by publisher");
          break;
        case 4:
          System.out.println("Search by title");
          break;

        default:
          System.out.println("Key word invalid");
          break;
      }
    }
  }

}
