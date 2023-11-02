package exercise;

import java.util.Scanner;

public class exercise2 {
  int base;
  int height;

  exercise2(int base, int height) {
    this.base = base;
    this.height = height;
  }

  void caculate() {
    int area = this.base * this.height;
    System.out.println(area);
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int x = input.nextInt();
      int y = input.nextInt();

      exercise2 triangle = new exercise2(x, y);

      triangle.caculate();
    }

  }

}
