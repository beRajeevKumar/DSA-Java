import java.util.Scanner;

public class Pattern11 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print 0 1 Pattern: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
