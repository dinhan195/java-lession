package methord;

import java.util.Scanner;

// Compute circle area 
public class practice1 {

  double computeArea(double radius) {
    if (radius < 0) {
      System.out.println("Bán kính không thể là giá trị âm.");
      return 0;
    }
    double area = Math.PI * Math.pow(radius, 2);
    return area;
  }

  public static void main(String[] args) {
    practice1 obj = new practice1();

    try (Scanner input = new Scanner(System.in)) {
      double radius = input.nextDouble();
      double result = obj.computeArea(radius);
      System.out.println(result);
    }
  }

}
