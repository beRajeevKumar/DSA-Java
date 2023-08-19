package Basic;

public class printNumbs {
  public static void main(String[] args) {
    printNums(1);
  }

  static void printNums(int n) {
    if (n == 6)
      return;
    System.out.println(n);
    printNums(n + 1);
  }
}
