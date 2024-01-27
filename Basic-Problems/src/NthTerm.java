import java.util.Scanner;

public class NthTerm {
  public static void main(String[] args) {
    // Given a series 9, 33, 73, 129... Find the n-th term of the series.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the valuse of N to find the value of Nth Term: ");
    int n = sc.nextInt();
    int nthTerm = 8 * (n * n) + 1;
    System.out.println("The Nth Term of the above series is: " + nthTerm);
    sc.close();
  }
}
