import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find its factorial: ");
    int n = sc.nextInt();
    System.out.println(factorial01(n));
    System.out.println(factorial02(n));
    System.out.println(factorial03(n));
  }

  // Approach 1;
  static int factorial01(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial01(n - 1);
  }

  // Approach 2;
  static int factorial02(int n) {
    int fac = 1;
    for (int i = 2; i <= n; i++) {
      fac *= i;
    }
    return fac;
  }

  // Approach 3:
  static int factorial03(int n) {
    return (n == 1 || n == 0) ? 1 : n * factorial03(n - 1);
  }
}
