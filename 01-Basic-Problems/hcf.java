public class hcf {
  public static void main(String[] args) {
    // gcd(13, 16);
    // gcd1(36, 60);
    System.out.println(gcd2(36, 60));
    System.out.println(gcdBest(36, 60));
    // gcd2(36, 60);
  }

  static void gcd(int a, int b) {
    int hcf = 1;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0)
        hcf = i;
    }
    System.out.println(hcf);
  }

  // we also can write this function as below :
  static int gcd1(int a, int b) {
    int hcf = Math.min(a, b);
    while (hcf > 0) {
      if (a % hcf == 0 && b % hcf == 0) {
        break;
      }
      hcf--;
    }
    return hcf;
  }

  // But the above code is not optimise so we need to write some optimise code to
  // solve it.
  static int gcd2(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  // But the best solution is mudulo operator in Euclidian Algorithm:
  static int gcdBest(int a, int b) {
    if (b == 0)
      return a;
    return gcdBest(b, a % b);
  }
}