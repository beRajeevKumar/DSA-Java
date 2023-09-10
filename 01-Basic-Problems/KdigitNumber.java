import java.util.Scanner;

public class KdigitNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long K = sc.nextLong();
    System.out.println(smallestKDigitNum(X, K));
    sc.close();
  }

  static Long smallestKDigitNum(Long X, Long K) {
    // long MAX = (long) Math.pow(10, K) - 1; // Maximum number with K digits
    // long MIN = (long) Math.pow(10, K - 1); // Minimum number with K digits
    if (K == 1)
      return X;
    long num = (long) Math.pow(10, K - 1);
    if (num % X == 0)
      return num;
    int rem = (int) (num % X);
    return num + (X - rem);
  }
}
