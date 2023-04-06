import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Value 1:");
    int num1 = scanner.nextInt();
    System.out.println("Enter Value 2:");
    int num2 = scanner.nextInt();
    int sum = num1 + num2;
    System.out.println("The sum of two numbers is :" + sum);
  }
}
