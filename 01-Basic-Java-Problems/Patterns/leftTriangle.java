import java.util.Scanner;

public class leftTriangle {
  public static void main(String[] args) {
    System.out.println("Enter the value of N to print now of row in Left Triangle");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
// Time complexity : O(n^2)
// Space complexity : O(1)
// Link to solve the Left Triangle pattern problem on GFG
// https://www.geeksforgeeks.org/java-program-to-print-left-triangle-star-pattern/