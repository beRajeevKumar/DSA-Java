public class printNums {
  public static void main(String[] args) {
    nums(5);
  }

  static void nums(int n) {
    if (n == 0)
      return;
    System.out.print(n + " ");
    nums(n - 1);
  }
}
