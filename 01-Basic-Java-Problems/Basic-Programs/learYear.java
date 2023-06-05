import java.util.Scanner;

public class learYear {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = scanner.nextInt();
    if (year % 100 == 0 && year % 400 == 0) {
      System.out.println("It's a Leap Year");
    } else if (year % 400 != 0 && year % 4 == 0 && year % 100 == 0) {
      System.out.println("It's not a Leap Year");
    } else {
      System.out.println("It's a Leap Year");
    }
    scanner.close();
  }
}
