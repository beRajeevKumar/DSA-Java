import java.util.Scanner;

public class largestAmongThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter Second Number: ");
    int num2 = sc.nextInt();
    System.out.println("Enter Third Number: ");
    int num3 = sc.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println("First Number is the Largest");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println("Second Number is the Largest");
    } else {
      System.out.println("Third Number is the Largest");
    }
  }
}