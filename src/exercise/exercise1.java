package exercise;

public class exercise1 {

  void getTamgac() {
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= 7; j++) {
        if (j == 1 || j == 7 || i == j) {
          System.out.print(i + "" + j + "");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println(" ");
    }

  }

  public static void main(String[] args) {
    exercise1 obj = new exercise1();
    obj.getTamgac();
    // for (int i = 0; i < 7; i++) {
    // for (int j = 0; j < 7; j++) {
    // System.out.print(i + "" + j + " ");
    // }
    // System.out.println("");
    // }
  }

}
