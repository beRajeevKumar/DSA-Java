import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number to find its Factorial: ");
    int num = sc.nextInt();
    long fac = 1;
    for (int i = 2; i <= num; i++) {
      fac = fac * i;
    }
    System.out.println("The Factorial of the given Number is: " + fac);
    sc.close();
  }
}
