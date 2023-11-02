package methord;

import java.util.Scanner;

public class reverse {

  int findReverse(int number) {
    int reversed = 0;
    int reverse;
    while (number != 0) {
      reverse = number % 10;
      reversed = reversed * 10 + reverse;
      number /= 10;
    }

    return reversed;
  }
  public static void main(String[] args) {
    reverse obj = new reverse();

    try (Scanner input = new Scanner(System.in)) {
      int number = input.nextInt();

      int result = obj.findReverse(number);
      System.out.println(result);
    }


  }
}
