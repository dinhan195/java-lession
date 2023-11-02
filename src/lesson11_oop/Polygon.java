package lesson11_oop;

import java.util.Scanner;

abstract class Polygon {
  abstract double caculateArea(double length, double breadth);

}

class Rectangle extends Polygon {

  double caculateArea(double length, double breadth) {
    double area = length * breadth;
    return area;
  }

}

class Main {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double length = input.nextDouble();
      double breadth = input.nextDouble();

      Rectangle rect = new Rectangle();

      double result = rect.caculateArea(length, breadth);
      System.out.println(result);
    }
  }
}