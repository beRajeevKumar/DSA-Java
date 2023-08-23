public class CountOnes {
  public static void main(String[] args) {
    System.out.println(countSetBits1(7));
    System.out.println(countSetBits2(7));
    System.out.println(countSetBits3(7));
    System.out.println(countSetBits4(7));
    System.out.println(countSetBits5(7));
  }

  // To Count the number of bits which are set.
  static int countSetBits1(int num) {
    int result = 0;
    while (num != 0) {
      if (num % 2 != 0) {
        result++;
      }
      num = num / 2;
    }
    return result;
  }

  static int countSetBits2(int num) {
    int count = 0;
    String bin = Integer.toBinaryString(num);
    for (int i = 0; i < bin.length(); i++) {
      if (bin.charAt(i) == '1') {
        count++;
      }
    }
    return count;
  }

  static int countSetBits3(int num) {
    return Integer.bitCount(num);
  }

  static int countSetBits4(int num) {
    int res = 0;
    while (num > 0) {
      res = res + (num & 1);
      num = num / 2;
    }
    return res;
  }

  // The Efficient Solution by using Brian Kernigum's Algorithm
  static int countSetBits5(int num) {
    int res = 0;
    while (num > 0) {
      num = num & (num - 1);
      res = res + 1;
    }
    return res;
  }
  // The Most Efficient Solution by using LookUp Table Method.
  // I will solve this method Tommorow with a better understanding of the
  // algorithm.
}
