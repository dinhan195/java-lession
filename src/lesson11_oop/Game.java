package lesson11_oop;

import java.util.Scanner;

public class Game {
  String usePick;
  String computePick;
  String result;

  String getComputerPick() {
    String computePick;
    int randomNumber = (int) (Math.random() * 3) + 1;

    if (randomNumber == 1) {
      computePick = "rock";
    } else if (randomNumber == 2) {
      computePick = "paper";
    } else {
      computePick = "scissors";
    }

    return computePick;
  }

  String getUserInput() {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter rook, paper or scissors");

      String userInput = input.nextLine();
      return userInput;
    }
  }

  String getUserPick() {
    try (Scanner input = new Scanner(System.in)) {
      String userPick;

      while (true) {
        System.out.println("Enter rock, paper or scissors: ");

        userPick = input.nextLine();

        if (userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors")) {
          break;
        }
      }
      return userPick;
    }
  }
  
  String getResult(String userPick, String computerPick) {

    // condition for user to draw
    if (userPick.equals(computerPick)) {
      return "draw";
    }

    // condition for user to win
    else if (userPick.equals("paper") && computerPick.equals("rock")) {
      return "win";
    }

    else if (userPick.equals("rock") && computerPick.equals("scissors")) {
      return "win";
    }

    else if (userPick.equals("scissors") && computerPick.equals("paper")) {
      return "win";
    }

    // all conditions results to loss
    else {
      return "lose";
    }
  }
}
class Main {
    public static void main(String[] args) {
 
        Game game = new Game();
        String userPick = game.getUserPick();
        String computerPick = game.getComputerPick();
        String result = game.getResult(userPick, computerPick);
 
        System.out.println("User Pick: " + userPick);
        System.out.println("Computer Pick: " + computerPick);
        System.out.println("You " + result);
 
    }
}