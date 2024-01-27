import java.util.Scanner;

public class Pattern19 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Hollow Diamond: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Upper Half
    for (int i = n; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    // Lower Half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
