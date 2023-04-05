public class EvenOddSort {
  public static void main(String[] args) {
    int arr[] = { 3, 1, 2, 4 };
    System.out.println(sortArrayByParity(arr));
  }

  static int[] sortArrayByParity(int[] nums) {
    int i = 0;
    int j = nums.length - 1;

    while (i < j) {
      int n = nums[i];
      if (n % 2 == 1) {
        swap(nums, i, j);
        j--;
      } else {
        i++;
      }
    }
    return nums;
  }

  static void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }
}
// It seems to be print java Gargen in vs code terminal But in Leetcode Platform
// its
// working perfectly.
// Here is the link of the Problem:--
//
// https://leetcode.com/problems/sort-array-by-parity/description/