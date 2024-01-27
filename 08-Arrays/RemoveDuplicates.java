public class RemoveDuplicates {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 20, 30, 30, 30, 30 };
    // int arr[] = { 10, 10, 10 };
    int n = arr.length;
    // System.out.println(removeDuplicates(arr, n));
    System.out.println(removeDuplicatesEfficient(arr, n));
  }

  static int removeDuplicatesEfficient(int arr[], int n) {
    int res = 1;
    for (int i = 1; i < n; i++) {
      if (arr[i] != arr[res - 1]) {
        arr[res] = arr[i];
        res++;
      }
    }
    return res;
    // The Time Complexity of the above function is O(n).
    // The Space Complexity of the above function is O(1).
  }

  static int removeDuplicates(int arr[], int n) {
    int temp[] = new int[n];
    int res = 1;
    temp[0] = arr[0];
    for (int i = 1; i < n; i++) {
      if (temp[res - 1] != arr[i]) {
        temp[res] = arr[i];
        res++;
      }
    }
    for (int i = 0; i < res; i++) {
      arr[i] = temp[i];
    }
    return res;
  }
  // The Time Complexity of the above function is O(n).
  // The Space Complexity of the above function is O(n).
}
