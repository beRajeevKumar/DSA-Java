import java.util.Scanner;

public class SumOfNthSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Nth term of the series: ");
    int n = sc.nextInt();
    long sum = 0;
    while (n != 0) {
      sum += (n * n * n);
      n--;
    }
    System.out.println("The Sum of Series: " + sum);
    sc.close();
  }
}
