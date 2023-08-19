public class TwoOddOccuring {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 1, 3, 2, 5 };
    // System.out.println(singleNumber(nums));
    singleNumber(nums);
    System.out.println();
    singleNumber1(nums, nums.length);
  }

  // Naive Solution
  static int[] singleNumber(int[] nums) {
    // int ans[] = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count % 2 != 0) {
        // ans[0] = nums[i];
        System.out.print(nums[i] + " ");
        // return new int[] { nums[i], nums[i] };
      }
    }
    return new int[] { 0, 0 };
  }

  // Efficient solution Time complexity:O(n) Auxilary Complexity: O(1)
  static int[] singleNumber1(int nums[], int n) {
    int x = nums[0];
    for (int i = 1; i < n; i++) {
      x = x ^ nums[i];
    }
    int k = (x & (~(x - 1)));
    int res1 = 0, res2 = 0;

    for (int i = 0; i < n; i++) {
      if ((nums[i] & k) != 0) {
        res1 = res1 ^ nums[i];
      } else {
        res2 = res2 ^ nums[i];
      }
    }
    System.out.println(res1 + " " + res2);
    return new int[] { res1, res2 };
  }
}
