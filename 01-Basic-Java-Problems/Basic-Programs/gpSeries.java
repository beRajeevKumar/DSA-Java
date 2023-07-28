public class gpSeries {
  public static void main(String[] args) {
    System.out.println(Nth_term(2, 2, 4));
  }

  static int Nth_term(int a, int r, int n) {
    int modulo = 1000000007;
    long value = (long) a * power(r, n - 1) % modulo;
    return (int) value;
  }

  public static long power(int r, int n) {
    int modulo = 1000000007;
    if (n == 0) {
      return 1;
    }
    long t = power(r, n / 2) % modulo;
    t = (t * t) % modulo;
    if (n % 2 == 0) {
      return t % modulo;
    }
    return (r * t) % modulo;
  }
}
