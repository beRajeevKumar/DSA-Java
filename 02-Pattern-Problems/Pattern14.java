import java.util.Scanner;

public class Pattern14 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Alphabet Right Triangle: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char ch = 'A';
    for (int i = 1; i <= n; i++) {
      ch = 'A';
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
    sc.close();
  }
}
