import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side A: ");
    int a = sc.nextInt();
    System.out.println("Enter side B: ");
    int b = sc.nextInt();
    System.out.println("Enter side C: ");
    int c = sc.nextInt();
    sc.close();
    System.out.println("The Area of Triangle: " + findArea(a, b, c));
  }

  static double findArea(int A, int B, int C) {
    // (s = (a+b+c)/2)
    // A = √(s(s-a)(s-b)(s-c))
    if (A == 0 || B == 0 || C == 0)
      return 0;
    double S = (double) (A + B + C) / 2;
    double area = S * (S - A) * (S - B) * (S - C);
    if (area < 0)
      return 0;
    return Math.sqrt(area);
  }
}
