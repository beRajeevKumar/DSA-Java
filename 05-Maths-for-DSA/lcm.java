public class LCM {
  public static void main(String[] args) {
// System.out.println(lcmFinder(4, 6));
System.out.println(lcmBest(4, 6));
  }
  // static int lcmFinder(int a,int b){
  //   int res=Math.max(a,b);
  //   while(true){
  //     if(res%a==0 && res%b==0){
  //       return res;
  //     } 
  //     res++;
  //   }
  // }
// The Time complexity of this solution is O(a*b-max(a,b)).

// Efficient Soution 

static int gcd(int a, int b){
  if(b==0) return a;
  return gcd(b,a%b);
}
static int lcmBest(int a, int b){

  return (a*b)/gcd(a,b);
}
// The Time complexity of our function is O(log(min(a,b)))
}
