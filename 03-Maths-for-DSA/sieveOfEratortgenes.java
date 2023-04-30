import java.util.Arrays;

public class sieveOfEratortgenes {
  public static void main(String[] args) {
    // sieve(10);
    // printPrimes(100);
    sieveOptimize(100);
  }

  static void sieveOptimize(int n) {
    boolean arr[] = new boolean[n + 1];
    Arrays.fill(arr, true);

    for (int i = 2; i * i <= n; i++) {
      if (arr[i]) {
        for (int j = i * i; j <= n; j = j + i) {
          arr[j] = false;
        }
      }

    }
    for (int i = 2; i <= n; i++) {
      if (arr[i]) {
        System.out.println(i + " ");
      }
    }
  }

  // static void sieve(int n) {
  // boolean arr[] = new boolean[n + 1];
  // Arrays.fill(arr, true);

  // for (int i = 2; i * i <= n; i++) {
  // if (arr[i]) {
  // for (int j = 2 * i; j <= n; j = j + i) {
  // arr[j] = false;
  // }
  // }

  // }
  // for (int i = 2; i <= n; i++) {
  // if (arr[i]) {
  // System.out.println(i + " ");
  // }
  // }
  // }
  /*
   * static void printPrimes(int n) {
   * for (int i = 2; i <= n; i++) {
   * if (isPrime(i)) {
   * System.out.println(i);
   * }
   * }
   * }
   * The time complexity of this function is O(n*sqrt(n)) so we will go for the
   * Sieve of Eratosthenes Algorithm.
   * static boolean isPrime(int n) {
   * if (n <= 1)
   * return false;
   * if (n == 2 || n == 3)
   * return true;
   * if (n % 2 == 0 || n % 3 == 0)
   * return false;
   * for (int i = 5; i * i <= n; i = i + 6) {
   * if (n % i == 0 || n % (i + 2) == 0)
   * return false;
   * }
   * return true;
   * }
   * 
   */
}
