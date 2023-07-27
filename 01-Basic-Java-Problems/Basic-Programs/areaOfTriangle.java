public class areaOfTriangle {
  public static void main(String[] args) {
    System.out.println(findArea(2, 2, 3));
  }

  static double findArea(int A, int B, int C) {
    double S = (A + B + C) / 2.0;
    double area = S * (S - A) * (S - B) * (S - C);
    if (area < 0) {
      return 0.0;
    }
    return Math.sqrt(area);
  }
}
