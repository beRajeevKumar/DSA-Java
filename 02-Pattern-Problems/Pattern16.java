import java.util.Scanner;

public class Pattern16 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Right Continue Alphabets Triangle: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char ch = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
      }
      System.out.println();
      ch++;
    }
    sc.close();
  }
}
