package com.rajeev;

public class MinimumCommomValue {
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={0,2,4};
        System.out.println(getCommon(nums1,nums2));
    }
    static int getCommon(int[] nums1, int[] nums2) {
        int i = 0,j = 0;
        int n1 = nums1.length,n2 = nums2.length;
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
}
