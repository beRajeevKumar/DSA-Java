package com.rajeev;
public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int arr[]={-18,-12,-4,0,6,8,10,15,18,20,22,25};
        int target=22;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            // find the middle element
            // int mid=(start+end)/2;
            // might be possible (start+end) exceeds the limit of int in java.
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                 return mid;
            }
        }
        return -1;
    }
}
