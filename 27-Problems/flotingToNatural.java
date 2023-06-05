public class flotingToNatural {
  public static void main(String[] args) {

  }

  public int findMinMultiple(String N) {
    // code here
    // int len = N.length();
    // int countAfterDot = 0;
    // boolean dotSeen = false;

    // int num = 0;
    // for (int i = 0; i < len; i++) {
    // if (N.charAt(i) != '.') {
    // num = num * 10 + (N.charAt(i) - '0');
    // if (dotSeen == true) {
    // countAfterDot++;
    // } else {
    // dotSeen = true;
    // }
    // }
    // }
    // if (dotSeen == false) {
    // return 1;
    // }
    // int denominator = (int) Math.pow(10, countAfterDot);

    // return (denominator / gcd(num, denominator));
    int n = N.length();
    int countafterdot = 0;
    boolean dotseen = false;
    int num = 0;
    for (int i = 0; i < n; i++) {
      if (N.charAt(i) != '.') {
        num = num * 10 + (N.charAt(i) - '0');
        if (dotseen == true)
          countafterdot++;

      } else {
        dotseen = true;
      }
    }
    if (dotseen == false) {
      return 1;
    }
    int dem = (int) Math.pow(10, countafterdot);
    return (dem / gcd(num, dem));
  }

  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
