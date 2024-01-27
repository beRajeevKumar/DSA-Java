public class CheckSorted {
  public static void main(String[] args) {
    int[] arr = { 8, 10, 10, 12 };
    // int arr[] = { 10, 20, 10, 12 };
    // int arr[] = { 10 };

    int n = arr.length;
    // System.out.println(isSorted(arr, n));
    System.out.println(isSortedEfficient(arr, n));
  }

  static boolean isSortedEfficient(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
    // The Time Complexity of the above function is Theta(n).
  }

  static int isSorted(int arr[], int n) {
    if (n == 1) {
      return 1;
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          return 0;
        }
      }
    }
    return 1;
  }
  // The Time Complexity of the above function is O(n^2).
}
