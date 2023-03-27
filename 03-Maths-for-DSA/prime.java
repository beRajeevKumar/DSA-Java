public class prime {
  public static void main(String[] args) {
    // System.out.println(isPrime(7));
    // System.out.println(isPrimeNum(36));
    System.out.println(isPrimeNumber(9));
  }
  // static boolean isPrime(int n) {
  //   if(n==1){
  //     return false;
  //   }
  //   for (int i = 2; i < n; i++) {
  //     if(n%i==0) return false;
  //   }
  //   return true;
  // }
  // The Time complexity of this solution in worst case is O(n), But we want more optimise solution
  // static boolean isPrimeNum(int n) {
  //   if(n==1) return false;
  //   for (int i = 2; i*i<=n; i++) {
  //     if(n%i==0) return false;
  //   }
  //   return true;
  // }
  // The Time complexity of this solution in worst case is O(root(n)), But again we want more optimise solution


   static boolean isPrimeNumber(int n) {
    if(n==1) return false;
    if(n==2 || n==3) return true;
    if(n%2==0 || n%3==0) return false;
    for (int i = 5; i*i<=n; i=i+6) {
      if(n%i==0 || n%(i+2)==0) return false;
    }
    return true;
   }

     // The Time complexity of this solution in worst case is much less than the O(root(n)) because we do here 1/3 work compare to the is above solution.
}
