package lession9_condition.do_white;

public class lession {
  public static void main(String[] args) {
    int a = 2;
    int total = 0;

    do {
      total += a;
      a++;

    } while (a <= 2);
    System.out.println("Total: " + total);
  }
}
