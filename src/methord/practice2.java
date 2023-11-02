package methord;

import java.util.Scanner;

public class practice2 {

  double simpleInterest(double principal, double time, double rate) {
    double interest = (principal * time * rate) / 100;
    return interest;
  }

  public static void main(String[] args) {
    practice2 obj = new practice2();

    try (Scanner input = new Scanner(System.in);) {

      System.out.println("Input principal: ");
      double principal = input.nextInt();
      System.out.println("Input time: ");
      double time = input.nextInt();
      System.out.println("Input rate: ");
      double rate = input.nextInt();

      double result = obj.simpleInterest(principal, time, rate);

      System.out.println("Result: " + result);

    } catch (Exception e) {
      // TODO: handle exception
    }
  }

}
