public class Palindrome {
  public static void main(String[] args) {
    int n = 555;
    System.out.println(palindromeCheck01(n));
    System.out.println(palindromeCheck02(n));
  }

  static boolean palindromeCheck01(int n) {
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

  static boolean palindromeCheck02(int n) {
    int temp = n;
    String number = Integer.toString(temp);
    String reverse_String = new StringBuilder(number).reverse().toString();
    if (number.equals(reverse_String)) {
      return true;
    }
    return false;
  }
}
