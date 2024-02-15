public class AllDivisors {
  public static void main(String[] args) {
    // divisors(30);
    divisors(36);
  }

  // static void divisors(int n) {
  // for (int i = 1; i <= n; i++) {
  // if (n % i == 0)
  // System.out.println(i);
  // }
  // }

  // My efficent method
  // static void divisors(int n) {
  // for (int i = 1; i * i <= n; i += 2) {
  // if (n % i == 0) {
  // System.out.println(i);
  // if (i != n / i) {
  // System.out.println(n / i);
  // }
  // }
  // }
  // }
  static void divisors(int n) {
    int i;
    for (i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i);
      }
    }
    for (; i >= 1; i--) {
      if (n % i == 0 && i != n / i) {
        System.out.println(n / i);
      }
    }
  }
  // The time complexity of this function is Theta(square root of N) but this is
  // in sorted order.
}
