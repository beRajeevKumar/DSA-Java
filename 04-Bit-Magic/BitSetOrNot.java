public class BitSetOrNot {
  public static void main(String[] args) {
    System.out.println(checkKthBit(5, 1));
    // System.out.println(Integer.toBinaryString(24));
  }

  static boolean checkKthBit(int n, int k) {
    // my first solution but not efficient
    // String bin = Integer.toBinaryString(n);
    // for (int i = bin.length() - 1; i >= k; i--) {
    // if (bin.charAt(i) == '1')
    // return true;
    // }
    // return false;
    // }

    // Second solution but not efficient
    // int x = 1;
    // for (int i = 0; i < (k - 1); i++) {
    // x = x * 2;
    // }
    // if ((n & x) != 0)
    // return true;
    // return false;

    // for (int i = 0; i < k - 1; i++) {
    // n = n / 2;
    // }
    // if ((n & 1) != 0)
    // return true;
    // return false;

    // Third solution
    // int x = (1 << (k - 1));
    // if ((n & x) != 0) {
    // return true;
    // }
    // return false;

    int x = (n >> (k - 1));
    if ((x & 1) != 0)
      return true;
    return false;
  }
}
/*
 * // Check even odd numbers by using and(&) operator.
 * static void evenOdd(int n) {
 * if ((n & 1) != 0) {
 * System.out.println("Odd");
 * } else
 * System.out.println("Even");
 * }
 * 
 */
