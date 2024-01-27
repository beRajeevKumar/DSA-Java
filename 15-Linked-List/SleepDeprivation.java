package com.rajeev;

import java.util.Scanner;

public class SleepDeprivation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for (int i = 1; i <=test; i++) {
            int hours=sc.nextInt();
            if(hours<7){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
