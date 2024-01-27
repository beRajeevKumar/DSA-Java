public class Print1toN {
  public static void main(String[] args) {
    printTillN(10);
  }

  // Solving This by using Non-Tail Recursion
  static void printTillN(int n) {
    if (n == 0)
      return;
    printTillN(n - 1);
    System.out.print(n + " ");
  }

  // Solving This by using Tail Recursion
  static void printTillN_TR(int n, int a) {
    if (n == 0)
      return;

    System.out.print(a);
    printTillN_TR(n - 1, a + 1);
  }

  // Time complexity of this above funciton will be Theta(n) and auxillary
  // complexity will be O(n).
}
