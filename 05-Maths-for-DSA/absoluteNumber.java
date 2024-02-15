import java.util.Scanner;

public class AbsoluteNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find its absolute value: ");
    int N = sc.nextInt();
    System.out.println("The absolute value of the number: " + absoluteNumber01(N));
    sc.close();
  }

  // Approach 01:
  static int absoluteNumber01(int N) {
    if (N <= 0) {
      return -1 * N;
    }
    return N;
  }

  // Approach 02:

  static int absoluteNumber02(int N) {
    return Math.abs(N);
  }
}
