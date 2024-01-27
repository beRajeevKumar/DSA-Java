public class Exectly3Divisors {
  public static void main(String[] args) {
    // System.out.println(exactly3Divisors(10));
    System.out.println(divCounter(9));
  }

  static int divCounter(int N) {
    int counter = 0;
    int ans = 0;
    for (int i = 1; i * i <= N; i++) {
      if (N % i == 0) {
        counter++;
        if (i != N / i) {
          counter++;
        }
      }
    }

    System.out.println(counter);
    for (int j = 4; j <= N; j++) {
      if (counter == 3) {
        ans++;
      }
    }
    return ans;

    // static int exactly3Divisors(int N) {
    // int count = 0;
    // for (int j = 4; j <= N; j++) {
    // if (divCounter(j) == 3) {
    // count++;
    // }
    // }
    // return count;
    // }
  }
}