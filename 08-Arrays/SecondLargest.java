public class SecondLargest {
  public static void main(String[] args) {
    // int arr[] = { 10, 20, 15, 8 };
    int[] arr = { 10, 10, 10 };
    int n = arr.length;
    System.out.println(secondLargest(arr, n));
  }

  static int secondLargest(int arr[], int n) {
    int largest = largestElement(arr, n);
    int res = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] != largest) {
        if (res == -1)
          res = i;
        else if (arr[i] > arr[res]) {
          res = i;
        }
      }
    }
    return res;
  }

  static int largestElement(int arr[], int n) {
    int max = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        return arr[i];
      }
    }
    return max;
    // The Time Complexity of the above function is Theta(n).
  }
}
