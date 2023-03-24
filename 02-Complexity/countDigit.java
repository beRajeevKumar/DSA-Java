public class countDigit {
  public static void main(String[] args) {
    int n=2446;
    System.out.println(evenlyDivides(n));
  }
  static int evenlyDivides(int N){
    // code here
    int count=0,rem=0;
    while(N>0){
      rem=N%10;
      if(rem!=0){
        if(N%rem==0 ){
          count+=1;
        }
      }
      N/=10;
    }
    return count;
}
}
