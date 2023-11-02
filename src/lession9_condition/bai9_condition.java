package lession9_condition;
import java.util.Scanner;

public class bai9_condition {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Input number: ");
      int a = input.nextInt();

      if (a >= 5) {
        System.out.println(true);
      } else {
        System.out.println(false);
      }
    }
  }

}
