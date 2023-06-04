package Basic;

public class printNums {
  public static void main(String[] args) {
    nums(5);
  }

  static void nums(int n) {
    if (n == 0)
      return;
    System.out.println(n);
    nums(n - 1);
  }
}
