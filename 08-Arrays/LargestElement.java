public class LargestElement {
  public static void main(String[] args) {
    int arr[] = { 10, 5, 20, 8 };
    int n = arr.length;
    System.out.println(largestElement1(arr, n));
    System.out.println(largestElement2(arr, n));
  }

  static int largestElement1(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      boolean flag = true;
      for (int j = 0; j < n; j++) {
        if (arr[j] > arr[i]) {
          flag = false;
          break;
        }
      }
      if (flag) {
        return i;
      }
    }
    return -1;
    // The Time Complexity of the above function is O(n^2).
  }

  static int largestElement2(int arr[], int n) {
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        return arr[i];
      }
    }
    return max;
    // The Time Complexity of the above function is Theeta(n).
  }
}
