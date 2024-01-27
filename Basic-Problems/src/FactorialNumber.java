public class FactorialNumber {
  public static void main(String[] args) {
    int n = 6;
    for (int i = n; i >= 1; i--) {
      n = n % factorial(n);
    }
    if (n == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }

  static int factorial(int n) {
    int f = 1;
    for (int i = 2; i <= n; i++) {
      f *= i;
    }
    return f;
  }
}
