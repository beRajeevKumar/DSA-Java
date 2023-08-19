package com.rajeev;

import java.util.Scanner;

public class smallFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for (int i = 1; i <=test ; i++) {
            int num=sc.nextInt();
            int fac=1;
            for (int j = num; j >0; j--) {
                fac=fac*j;
            }
            System.out.println(fac);
        }
    }
}
