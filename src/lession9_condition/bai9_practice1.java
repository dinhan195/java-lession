package lession9_condition;
import java.util.Scanner;

public class bai9_practice1 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Input a: ");
      double a = input.nextDouble();

      System.out.println("Input b: ");
      double b = input.nextDouble();

      System.out.println("Input c: ");
      double c = input.nextDouble();

      double delta = Math.pow(b, 2) - (4 * a * c);

      if (a != 0) {
        if (delta < 0) {
          System.out.println("Phương trình vô nghiệm " + delta);
        } else if (delta == 0) {
          double x = -b / (2 * a);
          System.out.println("Pt có nghiệm kép là : " + x);
        } else {
          double x1 = (-b + Math.sqrt(delta)) / (2 * a);
          double x2 = (-b - Math.sqrt(delta)) / (2 * a);

          System.out.println("x1 = " + x1);
          System.out.println("x2 = " + x2);
        }
      } else {
        System.out.println("Phương trình vô nghiệm");
      }
      input.close();

    }

  }

}
