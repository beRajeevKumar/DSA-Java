public class superPalindrome {
  public static void main(String[] args) {
    String left = "4";
    String right = "1000";
    System.out.println(superpalindromesInRange(left, right));
  }

  static int superpalindromesInRange(String left, String right) {
    int leftInt = Integer.parseInt(left);
    int rightInt = Integer.parseInt(right);
    int count = 0;
    for (int i = leftInt; i <= rightInt; i++) {
      if (checkPalindrome(i) == true && checkPalindrome(i * i) == true) {
        System.out.println(i);
        count++;
      }
    }

    return count;
  }

  static boolean checkPalindrome(int num) {
    int rev = 0;
    int temp = num;
    while (temp != 0) {
      int rem = temp % 10;
      rev = rev * 10 + rem;
      temp = temp / 10;
    }
    if (num == rev)
      return true;
    return false;
  }

}
