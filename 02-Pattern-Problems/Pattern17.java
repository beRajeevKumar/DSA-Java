import java.util.Scanner;

public class Pattern17 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Half Upper Alphabet Pyramid: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char ch = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = n - i; j >= 1; j--) {
        System.out.print(" ");
      }
      ch = 'A';
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      ch--;
      for (int j = 2; j <= i; j++) {
        ch--;
        System.out.print(ch);
      }
      System.out.println();
    }
    sc.close();
  }
}
