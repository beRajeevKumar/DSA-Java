package com.rajeev;
import java.util.Scanner;
public class hacker_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n , r , original , rev=0;
        n=sc.nextInt();
        original=n;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(original==rev){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
