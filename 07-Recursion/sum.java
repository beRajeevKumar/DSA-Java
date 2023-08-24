public class sum {
  public static void main(String[] args) {
    System.out.println(printSum(10));
  }

  static int printSum(int n) {
    if (n == 0)
      return 0;
    return n + printSum(n - 1);
  }
}
