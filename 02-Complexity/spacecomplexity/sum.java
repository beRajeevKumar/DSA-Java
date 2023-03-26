package spacecomplexity;

public class sum {
  public static void main(String[] args) {
    System.out.println(getSum(10));
  }
  // static int sum(int n){
  //   return n*(n+1)/2;
  // }
// Space complexity of above solution is O(1).
  // Other way to do sum.
  static int getSum(int n){
    int sum = 0;
    for(int i = 0; i <= n; i++){
      sum +=i;
    }
    return sum;
  }
  // Space complexity of above solution is O(1).
}
