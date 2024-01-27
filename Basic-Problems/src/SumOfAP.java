import java.util.Scanner;

public class SumOfAP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Nth Term of AP: ");
    int n = sc.nextInt();
    System.out.print("Enter First Term of AP: ");
    int a = sc.nextInt();
    System.out.print("Enter Common Difference of AP: ");
    int d = sc.nextInt();
    int sum = 0;
    int nextTerm = a;
    for (int i = 0; i < n; i++) {
      nextTerm = a + i * d;
      sum += nextTerm;
    }
    System.out.println("The Sum of Your AP Series is: " + sum);
    sc.close();
  }
}
