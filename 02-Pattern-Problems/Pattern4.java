import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Pattern: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
