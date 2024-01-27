import java.util.Scanner;

public class Pattern18 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Revese Alphabet Right Triangle: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = n - 1; i >= 0; i--) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print((char) (j + 65) + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
