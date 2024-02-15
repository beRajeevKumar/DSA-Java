public class Power {
  public static void main(String[] args) {
    // System.out.println(printPower(2, 4));
    System.out.println(powerValue(2, 5));
  }

  // static int printPower(int n, int p) {
  // int value = 1;
  // for (int i = 1; i <= p; i++) {
  // value = value * n;
  // }
  // return value;
  // }
  // The time complexity of this function is O(n) so we need to optimise this
  // solution

  static int powerValue(int x, int n) {
    if (n == 0)
      return 1;
    int temp = powerValue(x, n / 2);
    temp = temp * temp;
    if (n % 2 == 0)
      return temp;
    else {
      return temp * x;
    }
  }

  // static int Power(int x, int n) {
  // if (n == 0)
  // return 1;
  // if (n % 2 == 0) {
  // return Power(x, n / 2) * Power(x, n / 2);
  // } else {
  // return x * Power(x, n - 1);
  // }
  // }
}