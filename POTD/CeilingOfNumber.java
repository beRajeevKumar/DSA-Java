package com.rajeev;
public class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=4;
        //Ceiling =>Smallest Element in array that is greater or equal to the target.
        // Answer will be 6 (index of 18 in arr) because it is just greater than 17.
        // Notice here it is also a binary search process but it is returning just next greater number that is (Start) in each case not -1.
        int ans=CeilingNumber(arr,target);
        System.out.println(ans);
    }
    //Ceiling =>Smallest Element in array that is greater or equal to the target.
    static int CeilingNumber(int[]arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
