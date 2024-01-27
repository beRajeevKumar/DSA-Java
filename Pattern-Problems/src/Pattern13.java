import java.util.Scanner;

public class Pattern13 {
  public static void main(String[] args) {
    System.out.print("Enter the value of N to print Increasing Number Right Triangle: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int number = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
    sc.close();
  }
}
