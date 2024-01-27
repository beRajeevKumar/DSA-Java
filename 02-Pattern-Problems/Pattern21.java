import java.util.Scanner;

public class Pattern21 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Hollow Square: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j == 1 || j == n || i == 1 || i == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
