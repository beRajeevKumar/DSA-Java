public class factorial {
  public static void main(String[] args) {
    System.out.println(factorialValue(5));
  }

  static long factorialValue(int N) {
    if (N == 0)
      return 1;
    return N * factorialValue(N - 1);
  }
}
