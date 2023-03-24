package com.rajeev;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={-18,-12,-4,0,6,8,10,15,18,20,22,25};
        int[] arr={99,80,72,22,11,10,5,2,-2};
        int target=22;
        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr,int target){
        // return the index
        // return -1 if it does not exist

            int start=0;
            int end=arr.length-1;

            // find whether the array is ordered ascending or descending
        boolean isAsc=arr[start]<arr[end];

            while (start<=end){
                // find the middle element
                //  int mid=(start+end)/2;// might be possible (start+end) exceeds the limit of int in java.
                int mid=start+(end-start)/2;

                if(arr[mid]==target){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
                }
                else{
                    if(target>arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
                }
            }
            return -1;
        }

}
