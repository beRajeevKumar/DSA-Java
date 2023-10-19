public class test {
  public static void main(String[] args) {
    // System.out.println(numOfPerfectSquares(9, 25));
    System.out.println(oddNumberOfDivisor(4));
  }

  static int numOfPerfectSquares(int a, int b) {
    // code here
    // int count = 0;
    // for (int i = a; i <= b; i++) {
    // if (checkPerfectSquare(i) == 1) {
    // count++;
    // }
    // }
    // return count;
    return (int) (Math.sqrt(b)) - (int) Math.sqrt(a - 1);
  }

  static int checkPerfectSquare(int N) {
    double b = Math.sqrt(N);
    int a = (int) b;
    if (a == b) {
      return 1;
    }
    return 0;
  }

  static int oddNumberOfDivisor(int N) {
    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (NumberOfDivisor(i) % 2 != 0) {
        count++;
      }
    }
    return count;
  }

  static int NumberOfDivisor(int N) {
    int count = 0;
    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        count++;
      }
    }
    return count;
  }
}
