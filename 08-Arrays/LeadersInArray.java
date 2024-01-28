public class LeadersInArray {
  public static void main(String[] args) {
    int arr[] = { 7, 10, 4, 3, 6, 5, 2 };
    // int arr[] = { 16, 17, 4, 3, 5, 2 };
    int n = arr.length;
    // leadersInArray(arr, n);
    leadersInArrayEfficient(arr, n);

  }

  static void leadersInArrayEfficient(int arr[], int n) {
    int curr_ldr = arr[n - 1];
    System.out.print(curr_ldr + " ");
    for (int i = n - 2; i >= 0; i--) {
      if (curr_ldr < arr[i]) {
        curr_ldr = arr[i];
        System.out.print(curr_ldr + " ");
      }
    }
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    // Drawback: The leaders are printed in reverse order.
  }

  static void leadersInArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      boolean flag = false;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] <= arr[j]) {
          flag = true;
          break;
        }
      }
      if (flag == false) {
        System.out.print(arr[i] + " ");
      }
    }
    // Time Complexity: O(n^2)
    // Auxiliary Space: O(1)
  }
}
