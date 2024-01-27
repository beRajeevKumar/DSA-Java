public class PerfectSquare {
  public static void main(String[] args) {
    System.out.println(checkPerfectSquare(35));
  }

  static int checkPerfectSquare(int N) {
    double b = Math.sqrt(35);
    int a = (int) b;
    if (a == b) {
      return 1;
    }
    return 0;
  }
}
