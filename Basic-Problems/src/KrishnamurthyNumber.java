import java.util.Scanner;

public class KrishnamurthyNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int N = sc.nextInt();
    int sum = 0;
    int num = N;
    while (num != 0) {
      int digit = num % 10;
      sum += factorial(digit);
      num /= 10;
    }
    if (sum == N) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }

  static int factorial(int number) {
    int f = 1;
    for (int i = 2; i <= number; i++) {
      f *= i;
    }
    return f;
  }
}
