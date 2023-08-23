public class Print1toN {
  public static void main(String[] args) {
    printTillN(10);
  }

  static void printTillN(int n) {
    if (n == 0)
      return;
    printTillN(n - 1);
    System.out.print(n + " ");
  }
  // Time complexity of this above funciton will be Theta(n) and auxillary complexity will be O(n).
}
