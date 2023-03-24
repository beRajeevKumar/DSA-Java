package com.rajeev;

public class SquareRoot {
    public static void main(String[] args) {
//        System.out.println(power(4,3));
       int x= SquareRoot(36);
        System.out.println(x);
    }

    static int SquareRoot(long n){
        int i=1;
        while(i*i<=n){
            i++;
        }
//        for (int j = 1; j < n/2; j++) {
//
//        }
        return i-1;
    }
}
