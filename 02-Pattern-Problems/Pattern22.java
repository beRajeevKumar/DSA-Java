import java.util.Scanner;

public class Pattern22 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Square: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int matrix_size = 2 * n - 1;
    for (int i = 1; i <= matrix_size; i++) {
      for (int j = 1; j <= matrix_size; j++) {
        int symbol = Math.max(Math.abs(n - i), Math.abs(n - j)) + 1;
        System.out.print(symbol + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
