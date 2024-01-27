import java.util.Scanner;

public class Pattern8 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Reverse Pyramid: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }

}
