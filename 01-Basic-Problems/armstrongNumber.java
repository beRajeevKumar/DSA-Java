public class armstrongNumber {
  public static void main(String[] args) {
    System.out.println(armstrongNumberChecker(153));
  }

  static String armstrongNumberChecker(int n) {
    int value = n;
    int sum = 0;
    while (value != 0) {
      int rem = value % 10;
      sum = sum + (rem * rem * rem);
      value = value / 10;
    }
    if (sum == n) {
      return "Yes";
    } else {
      return "NO";
    }
  }
}
