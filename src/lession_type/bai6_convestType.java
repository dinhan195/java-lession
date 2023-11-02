package lession_type;
public class bai6_convestType {

  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    double y = (double) a / b; // convest int >> double
    System.out.println(y);
    // Ép kiểu từ lớn sang bé

    int c = 128;
    byte d = (byte) c; // Ép dữ liệu tù lớn sang bé có thể mất dữ liệu
    System.out.println(c);
    System.out.println(d); // => -128 không đúng

  }

}