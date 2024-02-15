public class Palindrome {
  public static void main(String[] args) {
    int n = 555;
    System.out.println(palindromeCheck(n));
  }

  static boolean palindromeCheck(int n) {
    int temp = n;
    int rem = 0, rev = 0;
    while (n > 0) {
      rem = temp % 10;
      rev = rev * 10 + rem;
      n /= 10;
    }
    if (temp == rev) {
      return true;
    }
    return false;
  }
}
