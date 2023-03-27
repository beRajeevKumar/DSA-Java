public class JavaOperator {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println(FindRoots(2, 3, 2));
  }

  static double[] FindRoots(int A, int B, int C) {
    double ans[] = new double[2];

    double d = B * B - 4 * A * C;
    if (d < 0)
      return new double[] { -1.0 };
    d = Math.sqrt(d);
    double r1 = (-B + d) / (2 * A);
    double r2 = (-B - d) / (2 * A);
    ans[0] = r1;
    ans[1] = r2;
    return ans;
  }
  // It seems to be print java Gargen in vs code terminal But in GFG Platform its
  // working perfectly
  // Here is the link of the Problem:--
  //
  // https://practice.geeksforgeeks.org/problems/java-operatorsarithmetic-set-12417/1?page=3&difficulty[]=-1&category[]=Mathematical&sortBy=submissions
}
