public class SearchOperation {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int x = 6;
    int n = arr.length;
    System.out.println(search(arr, n, x));
  }

  static int search(int[] arr, int n, int x) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == x)
        return i;
    }
    return -1;
  }
  // The Time Complexity to search an element in a sorted array is O(n) by using
  // Linear Search (Above).
  // The Time Complexity to search an element in a sorted array is O(log n) by
  // using Binary Search.
}
