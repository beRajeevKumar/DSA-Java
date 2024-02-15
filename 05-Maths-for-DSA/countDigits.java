import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to count the number of digits in it: ");
    // int N = sc.nextInt();
    // System.out.println(countDigits01(N));
    // long N = sc.nextLong();
    // System.out.println("Number of digits: " + countDigits02(N));

    int N = sc.nextInt();
    System.out.println("Number of digits: " + countDigits04(N));
    sc.close();
  }

  // Approach 01:
  static int countDigits01(int n) {
    int count = 0;
    while (n != 0) {
      n = n / 10;
      count++;
    }
    return count;
  }

  // Approach 02:
  static int countDigits02(long n) {
    return (int) Math.floor(Math.log10(n) + 1);
  }

  // Approach 03:
  static int countDigits03(int n) {
    String num = Integer.toString(n);
    return num.length();
  }

  // Approach 04:
  static int countDigits04(int n) {
    if (n / 10 == 0)
      return 1;
    return 1 + countDigits04(n / 10);
  }
}