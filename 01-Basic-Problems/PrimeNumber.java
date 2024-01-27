import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check Prime: ");
    int num = sc.nextInt();
    if (isPrime(num) == 1) {
      System.out.println(num + " is a Prime Number.");
    } else {
      System.out.println(num + " is not a Prime Number.");
    }
    sc.close();
  }

  static int isPrime(int N) {
    if (N <= 1)
      return 0;
    if (N == 2 || N == 3)
      return 1;
    if (N % 2 == 0 || N % 3 == 0)
      return 0;
    for (int i = 5; i * i <= N; i = i + 6) {
      if (N % i == 0 || N % (i + 2) == 0) {
        return 0;
      }
    }
    return 1;
  }
}
