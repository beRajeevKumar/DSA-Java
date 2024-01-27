package com.rajeev;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(100);list.add(200);list.add(300);list.add(400);
        int N=list.size();
        int K=2;
        long ans=maximumSumSubarray(2,list,N);
        System.out.println(ans);
    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here
        long Osum=Integer.MIN_VALUE;
        for (int i = 0; i < N-K+1; i++) {
            long Csum=0;
            for(int j=i; j < i + K; j++){
                Csum+=Arr.get(j);
                if(Csum>Osum){
                    Osum=Csum;
                }
            }
        }
        return Osum; // The answer will be 700 but the answer is coming 300.
    }
}
