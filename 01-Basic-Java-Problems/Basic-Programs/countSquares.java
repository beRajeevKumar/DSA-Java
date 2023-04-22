public class countSquares {
  public static void main(String[] args) {
    System.out.println(squaresCounter(9));

  }

  static int squaresCounter(int N) {
    // code here
    int count = 0;
    for (int i = 1; i < N; i++) {
      if (i * i < N) {
        count++;
      } else {
        break;
      }
    }
    return count;
  }
}
