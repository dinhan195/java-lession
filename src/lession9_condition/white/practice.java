package lession9_condition.white;

import java.util.Scanner;

//Program check user input character 3 - 20

public class practice {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      String userInput = input.nextLine();

      int totalChar = (int) userInput.length();

      System.out.println("User input: " + userInput + "\n Total char: " + totalChar);

      while (totalChar < 3 || totalChar > 20) {
        System.out.println("Please input 3 - 10 character");
        userInput = input.nextLine();
      }
      System.out.println("Password ok");

    }

  }

}
