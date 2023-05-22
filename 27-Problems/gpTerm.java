public class gpTerm {
  public static void main(String[] args) {

    // System.out.println(2 * power(3, 2));
    System.out.println(termOfGP(1, 2, 5));
  }

  static double termOfGP(int A, int B, int N) {
    // Your code here
    int r = B / A;
    return A * power(r, N - 1);
  }

  static int power(int x, int n) {
    if (n == 0)
      return 1;
    int temp = power(x, n / 2);
    temp = temp * temp;
    if (n % 2 == 0) {
      return temp;
    } else {
      return temp * x;
    }
  }
}
