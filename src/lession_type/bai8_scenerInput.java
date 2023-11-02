package lession_type;
import java.util.Scanner;

public class bai8_scenerInput {
  public static void main(String[] args) {
    try (// Khởi tạo đối tương input
        Scanner input = new Scanner(System.in)) {
      // Cho phép nhập chuổi
      System.out.println("Input string: ");

      String passwork = input.nextLine();
      System.out.println("Passwork is: " + passwork);

      // Nhập số nguyên
      System.out.println("Input int: ");
      int passwork1 = input.nextInt();
      System.out.println("Passwork is: " + passwork1);

      // Nhập float
      System.out.println("Input float: ");
      float passwork2 = input.nextFloat();
      System.out.println("Passwork is: " + passwork2);

      // Nhập số thực double
      System.out.println("Input double: ");
      Double passwork3 = input.nextDouble();
      System.out.println("Passwork is: " + passwork3);
    }
  }
}
