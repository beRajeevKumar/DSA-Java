import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    System.out.println("Enter the year to check whether it is a leap year or not!");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (year % 4 == 0) {
      if (year % 100 == 0 && year % 400 == 0) {
        System.out.println(year + " is a Leap Year.");
      } else if (year % 400 != 0 && year % 100 == 0) {
        System.out.println(year + " is not a Leap Year.");
      } else {
        System.out.println(year + " is a Leap Year.");
      }
    } else {
      System.out.println(year + " is not a Leap Year.");
    }
    sc.close();
  }
}
