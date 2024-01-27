import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Pattern: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
