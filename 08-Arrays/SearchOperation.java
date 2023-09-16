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
  // The Time Complexity of the above function is O(n).
}
