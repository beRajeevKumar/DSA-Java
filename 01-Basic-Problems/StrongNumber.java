public class StrongNumber {
  public static void main(String[] args) {
    System.out.println(isStrong(145));
  }

  static int isStrong(int N) {
    int temp = N;
    int sum = 0;
    while (temp != 0) {
      int digit = temp % 10;
      sum += factorial(digit);
      temp /= 10;
    }
    if (sum == N)
      return 1;
    return 0;
  }

  static int factorial(int n) {
    int f = 1;
    for (int i = 2; i <= n; i++) {
      f = f * i;
    }
    return f;
  }
}
