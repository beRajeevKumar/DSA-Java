package com.rajeev;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int test=sc.nextInt();
//
//        for (int i = 1; i <=test; i++) {
//            int A= sc.nextInt();
//            int B= sc.nextInt();
//            int C= sc.nextInt();
//            if(A>B && A>C){
//                if(B>C){
//                    System.out.println(B);
//                }else {
//                    System.out.println(C);
//                }
//            }else if(B>A && B>C){
//                if(A>C){
//                    System.out.println(A);
//                }else {
//                    System.out.println(C);
//                }
//            }else if(C>A && C>B){
//                if(A>B){
//                    System.out.println(A);
//                }else {
//                    System.out.println(B);
//                }
//            }
//        }

        // Best solution of this problem

        int[] arr=new int[3];
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for (int i = 0; i < test; i++) {
            arr[0]=sc.nextInt();
            arr[1]= sc.nextInt();
            arr[2]= sc.nextInt();

            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
