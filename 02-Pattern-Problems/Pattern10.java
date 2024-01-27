import java.util.Scanner;

public class Pattern10 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Half Diamond: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    sc.close();
  }
}
