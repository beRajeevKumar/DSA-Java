import java.util.Scanner;

public class FibonacciTillNth {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to print fibonacci series: ");
    int n = sc.nextInt();
    int num1 = 0;
    int num2 = 1;
    System.out.print(num1 + " ");
    for (int i = 1; i <= n; i++) {
      int nextNum = num1 + num2;
      num1 = num2;
      num2 = nextNum;
      System.out.print(nextNum + " ");
    }

    sc.close();
  }
}
