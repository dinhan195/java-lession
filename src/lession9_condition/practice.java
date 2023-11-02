package lession9_condition;

import java.util.Scanner;

public class practice {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double avgScore = input.nextDouble();

      String classification = (avgScore >= 8) ? "good"
          : avgScore >= 6.5 ? "rather"
          : avgScore >= 5 ? "medium" : "weak";
      System.out.println(classification);

    }

  }

}
