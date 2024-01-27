public class Replace0to5 {
  public static void main(String[] args) {
    System.out.println(convertfive(1004));
  }

  static int convertfive(int num) {
    int ans = 0;
    while (num != 0) {
      int digit = num % 10;
      if (digit == 0) {
        digit += 5;
        ans = ans * 10 + digit;
      } else {
        ans = ans * 10 + digit;
      }
      num /= 10;
    }
    int revAns = 0;
    while (ans != 0) {
      int digit = ans % 10;
      revAns = revAns * 10 + digit;
      ans /= 10;
    }
    return revAns;
  }
  // Optimise Apparoach
  // static int convertfive(int num) {
  // int ans = 0;
  // int mul = 1;
  // while (num != 0) {
  // int digit = num % 10;
  // if (digit == 0) {
  // digit = 5;
  // }
  // ans += digit * mul;
  // mul *= 10;
  // num /= 10;
  // }
  // return ans;
  // }
}
