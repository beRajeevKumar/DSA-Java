public class lcmAndGcd {
  public static void main(String[] args) {
    System.out.println(lcm(100, 200));
  }

  static Long[] lcmAndGcdFinder(Long A, Long B) {
    Long arr[] = new Long[2];
    arr[0] = lcm(A, B);
    arr[1] = gcd(A, B);
    return arr;
  }

  static long gcd(long A, long B) {
    if (B == 0)
      return A;
    return gcd(B, A % B);
  }

  static long lcm(long A, long B) {
    return (A * B) / gcd(A, B);
  }
}
// It seems to be print java Gargen in vs code terminal But in GFG Platform its
// working perfectly.
// Here is the link of the Problem:--
//

// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1?page=2&difficulty[]=-1&category[]=Arrays&category[]=Mathematical&sortBy=submissions