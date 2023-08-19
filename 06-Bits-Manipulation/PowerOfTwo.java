public class PowerOfTwo {
  public static void main(String[] args) {
    // System.out.println(isPowerOfTwo1(4));
    // System.out.println(isPowerOfTwo2(4));
    System.out.println(isPowerOfTwo3(4));
    System.out.println(isPowerOfTwo4(4));
  }

  static boolean isPowerOfTwo1(int power) {
    // int val=power << 1;
    // if(val == power)
    // return true;
    int value = power;
    if (power << 1 == value)
      return true;
    return false;
  }

  static boolean isPowerOfTwo2(int n) {
    if (n == 0)
      return false;
    while (n != 1) {
      if (n % 2 == 0) {
        return true;
      }
      n /= 2;
    }
    return false;
  }

  // By using the Brian Kerningum Algorithm
  static boolean isPowerOfTwo3(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }
    if (count == 1)
      return true;
    return false;

  }

  static boolean isPowerOfTwo4(int n) {
    if (n == 0)
      return false;
    return ((n & (n - 1)) == 0);
  }
}
