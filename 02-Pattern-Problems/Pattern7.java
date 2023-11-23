import java.util.Scanner;

public class Pattern7 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Right angle Triangle: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    sc.close();
  }
}
// *
// ***
// *****
// *******
// *********