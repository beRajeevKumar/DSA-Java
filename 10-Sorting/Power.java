package com.rajeev;

public class Power {
    public static void main(String[] args) {

        System.out.println(power(10,1));

    }
    /* function to find the power of a number
    static long power(int base,int exponent){
        int mod=1000000007;
         long value=1;
        for(int i=1;i<=exponent;i++){
          value= value*base;
        }
        return value;
    }

     */
    /* function to return a reverse a number
    static int reverse(int num){
         int sum=0;
         while(num!=0){
            int rem= num%10;
            sum=sum*10+rem;
            num=num/10;
         }
         return sum;
    }
    */
    static long power(int N,int R)
    {
        //Your code here
        long mod =1000000007;
        if(R == 0)
        {
            return 1;
        }
        long temp =power(N , R/2);
        long rem = (temp * temp)%mod;

        if(R%2==1)
        {
            rem = (rem * N)%mod;
        }
        return rem;
    }

}



