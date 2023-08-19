public class lcm {
  public static void main(String[] args) {
    System.out.println(lcmBest(12, 20));
  }

  static int lcmBest(int a, int b) {
    return a * b / gcdBest(a, b);
  }

  static int gcdBest(int a, int b) {
    if (b == 0)
      return a;
    return gcdBest(b, a % b);
  }
}
