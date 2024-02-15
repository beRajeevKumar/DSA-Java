public class LargestPrimeNumber {
  public static void main(String[] args) {
    System.out.println(largestPrimeFactor(24));
  }

  static long largestPrimeFactor(int N) {
    // code here
    for (int i = 2; i * i <= N; i++) {
      if (N % i == 0) {
        while (N % i == 0 && N != i) {
          N /= i;
        }
      }
    }
    return N;
  }
}
