import java.util.Arrays;

public class FibonacciSeries {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(printFibb(2)));
  }

  public static long[] printFibb(int n) {
    long ans[] = new long[n];
    ans[0] = 1;
    if (n == 1)
      return ans;
    ans[1] = 1;
    if (n == 2)
      return ans;
    long num1 = 0;
    long num2 = 1;
    for (int i = 1; i < n; i++) {
      long nextNum = num1 + num2;
      ans[i] = nextNum;
      num1 = num2;
      num2 = nextNum;
    }
    return ans;
  }
}
