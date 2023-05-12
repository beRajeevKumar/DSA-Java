import java.util.Scanner;

public class rightTriangle {
  public static void main(String[] args) {
    System.out.println("Enter the value of N to print Right Triangle");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
// We also can solve this problem by using recursion
