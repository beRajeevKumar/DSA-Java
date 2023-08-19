package com.rajeev;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int temp=x;
        while(temp!=0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        System.out.println(sum);
        if(temp==sum) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
        return x==sum;
    }
}
