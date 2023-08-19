public class addBinaryStrings {
  public static void main(String[] args) {
    String num1 = "011011";
    String num2 = "1010111";
    System.out.println(addBinary(num1, num2));
  }

  static String addBinary(String x, String y) {
    int num1 = Integer.parseInt(x, 2);
    int num2 = Integer.parseInt(y, 2);
    int sum = num1 + num2;
    String res = Integer.toBinaryString(sum);
    return res;
  }
}
// How to add Strings and then convert it into binary
// https://www.geeksforgeeks.org/java-program-to-add-two-binary-strings/