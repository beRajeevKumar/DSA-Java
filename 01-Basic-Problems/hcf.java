import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter First Number: ");
    int num2 = sc.nextInt();
    System.out.println("The HCF of Two Numbers is: " + gcd(num1, num2));
    sc.close();
  }

  static int gcd(int A, int B) {
    // Euclidean algorithm
    while (B != 0) {
      int temp = B;
      B = A % B;
      A = temp;
    }
    return A;
  }
}
