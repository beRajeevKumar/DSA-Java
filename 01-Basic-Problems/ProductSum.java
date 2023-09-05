import java.util.Scanner;

public class ProductSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number 1: ");
    long a = sc.nextLong();
    System.out.print("Enter Number 2: ");
    long b = sc.nextLong();
    long multiply = a * b;
    long count = 0;
    while (multiply != 0) {
      multiply = multiply / 10;
      count++;
    }
    System.out.println("The Total Number of Digits in product of two numbers is: " + count);
    sc.close();
  }
}
