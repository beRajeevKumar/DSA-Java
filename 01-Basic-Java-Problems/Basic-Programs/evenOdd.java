public class evenOdd {
  public static void main(String[] args) {
    OddEvenChecker(14);
  }

  static void OddEvenChecker(int num) {
    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
