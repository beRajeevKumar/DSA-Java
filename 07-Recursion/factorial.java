public class factorial {
  public static void main(String[] args) {
    System.out.println(printFactorial(4));
  }

  static int printFactorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * printFactorial(n - 1);
  }
  // The recurrence relation of this function is T(n) = T(n - 1) + O(1)
  // Time complexity of the above function is Theta(n) and
  // The auxiliary space complexity will be O(n)
}
