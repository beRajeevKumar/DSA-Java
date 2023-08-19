package Basic;

public class sum {
  public static void main(String[] args) {

    printSum(10);
  }

  static void printSum(int n) {
    if (n == 0)
      return;
    System.out.println(n);
    printSum(n - 1);
  }
}
