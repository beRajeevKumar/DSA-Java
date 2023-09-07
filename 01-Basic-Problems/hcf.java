public class hcf {
  public static void main(String[] args) {
    System.out.println(gcd(12, 60));
  }

  static int gcd(int A, int B) {
    // Euclidean algorithm
    while (B != 0) {
      int temp = B;
      B = A % B;
      A = temp;
    }
    return A;
  }
}
