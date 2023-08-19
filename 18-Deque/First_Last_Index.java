package com.rajeev;

public class First_Last_Index {
    public static void main(String[] args) {

    }
    static int[] firstLastIndex(int arr[],int x,int n){
        int ans[]=new int[2];
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(x>arr[mid]){
                start=mid+1;
            }else if(x<arr[mid]){
                end=mid-1;
            }else{
//                return mid;
            }
        }
        return ans;
    }
}
