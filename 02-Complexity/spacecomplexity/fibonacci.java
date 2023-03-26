package spacecomplexity;

public class fibonacci {
  public static void main(String[] args) {
    System.out.println(fibNth(10));
  }
  // static int fibo(int n){
  //   if(n==0 || n==1){
  //     return n;
  //   }
  //   return fibo(n-1)+fibo(n-2);
  // }
  // Auxilary Time complexity  of this fibo function is O(1)

  // static int fib(int n){
  //   int arr[] = new int[n+1];
  //   arr[0] =0;
  //   arr[1] =1;
  //   for(int i = 2; i <= n; i++){
  //     arr[i]=arr[i-1]+arr[i-2];
  //   }
  //   return arr[n];
  // }
    // Auxilary & space complexity  of this fibo function is Theta(n)

    static int fibNth(int n){
      int a =0,b=1,c;
      if(n==0||n==1) return 0;
      for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
      }
      return b;
    }
        // Auxilary &  space complexity  of this fibo function is Theta(1)
}
