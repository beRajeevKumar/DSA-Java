package com.rajeev;
import java.util.Scanner;
public class powerFunction {
    public static void powerFunction(int b,int p){
        int value=1;
        for(int i=p; i>=1;i--){
             value=value*b;
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power= sc.nextInt();
        powerFunction(base,power);
    }
}
