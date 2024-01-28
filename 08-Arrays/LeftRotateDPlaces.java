import java.util.Arrays;

public class LeftRotateDPlaces {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    int d = 2;
    System.out.println(Arrays.toString(arr));
    // leftRotateDPlaces(arr, n, d);
    // leftRotateDPlacesUsingArray(arr, n, d);
    leftRotateDPlacesReversalAlgorithm(arr, n, d);
    System.out.println(Arrays.toString(arr));
  }

  //////////////////////////////////////////////
  // Approach 03: Reversal Algorithm (Best)
  static void leftRotateDPlacesReversalAlgorithm(int[] arr, int n, int d) {
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
    // Time Complexity of the leftRotateDPlaces function is O(n) and Space
    // Complexity is O(1).
  }

  static void reverse(int[] arr, int low, int high) {
    while (low < high) {
      swap(arr, low, high);
      low++;
      high--;
    }
  }

  static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  //////////////////////////////////////////////
  // Approach 02: Using temp array
  static void leftRotateDPlacesUsingArray(int[] arr, int n, int d) {
    int[] temp = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    }
    for (int i = 0; i < d; i++) {
      arr[n - d + i] = temp[i];
    }
    // Time Complexity of the leftRotateDPlaces function is O(n)
    // Space Complexity is O(d).
  }

  ////////////////////////////////////
  // Approach 01: Brute Force
  static void leftRotateDPlaces(int[] arr, int n, int d) {
    for (int i = 0; i < d; i++) {
      leftRotateOne(arr, n);
    }
    // Time Complexity of the leftRotateDPlaces function is O(n*d) and Space
    // Complexity is O(1).
  }

  static void leftRotateOne(int[] arr, int n) {
    int temp = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n - 1] = temp;
  }
}
