package Basic;

public class printNums {
  public static void main(String[] args) {
    nums(5);
  }

  static void nums(int n) {
    if (n == 0)
      return;
    nums(n - 1);
    System.out.println(n);
  }

}
