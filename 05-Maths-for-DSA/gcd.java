public class GCD {
  public static void main(String[] args) {
    System.out.println(gcdFinder(4, 6));
    System.out.println(gcdFinder2(4, 6));
    System.out.println(gcdFinderBest(4, 6));
    System.out.println(gcdFinderTop(4, 6));
  }

  static int gcdFinder(int a, int b) {
    int hcf = 0;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        hcf = i;
      }
    }
    return hcf;
    // Time complexity of gdcFinder2 function is O(a) because loop runs a times.
  }

  static int gcdFinder2(int a, int b) {
    int res = Math.min(a, b);
    while (res > 0) {
      if (a % res == 0 && b % res == 0) {
        break;
      }
      res--;
    }
    return res;
    // Time complexity of gdcFinder2 function is O(minimum(a,b));
  }

  static int gcdFinderBest(int a, int b) {
    while (a != b) {
      if (a > b)
        a = a - b;
      else
        b = b - a;
    }
    return a;
  }

  // Time complexity of gdcFinderBest function is O() because here we do
  // repeatedly subtract values in each stop.
  static int gcdFinderTop(int a, int b) {
    if (b == 0)
      return a;
    return gcdFinderTop(b, a % b);
  }
}
