import java.util.Scanner;

public class QuadraticEquationRoots {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b: ");
    int b = sc.nextInt();
    System.out.print("Enter the value of c: ");
    int c = sc.nextInt();
    roots(a, b, c);
    sc.close();

  }

  // Approach 01:
  static void roots(int a, int b, int c) {
    if (a == 0) {
      System.out.println("It is not a Quadratic Equation.");
      return;
    }
    double d = (b * b) - 4 * a * c;
    double root_d = Math.sqrt(Math.abs(d));
    System.out.println(root_d);
    if (d > 0) {
      int root1 = (-b + (int) Math.sqrt(d)) / 2 * a;
      int root2 = (-b - (int) Math.sqrt(d)) / 2 * a;
      System.out.println("Roots are Real and Different, They are: " + root1 + ", " + root2 + ".");
    } else if (d == 0) {
      int roots = -b / (2 * a);
      System.out.println("Roots are Real and Equal, They are: " + roots + ", " + roots + ".");
    } else {
      System.out.print("Roots are Imaginary and Different, ");
      System.out.print("They are: " + -(double) b / (2 * a) + " + i" + root_d / (2 * a) + ", "
          + -(double) b / (2 * a) + " - i" + root_d / (2 * a) + ".");

    }
  }
}