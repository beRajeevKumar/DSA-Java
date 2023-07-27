public class strongNumbers {
  public static void main(String[] args) {
    // System.out.println(countDigits(1234));
    System.out.println(is_StrongNumber(145));

  }

  // static int countDigits(int n) {
  // int count = 0;
  // while (n > 0) {
  // n = n / 10;
  // count++;
  // }
  // return count;
  // }
  static int is_StrongNumber(int n) {
    int value = n;
    int sum = 0;
    int f = 1;
    while (n > 0) {
      int rem = n % 10;
      for (int i = 2; i <= rem; i++) {
        f *= i;
      }
      sum = sum + f;
      n /= 10;
      f = 1;
    }
    if (sum == value) {
      return 1;
    }
    return 0;
  }

}
