package Basic;

public class factorial {
  public static void main(String[] args) {
    System.out.println(printFactorial(4));
  }

  static int printFactorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * printFactorial(n - 1);
  }
}
