import java.util.Arrays;

public class MoveZeros {
  public static void main(String[] args) {
    int[] arr = { 8, 5, 0, 10, 0, 20 };
    int n = arr.length;
    System.out.println(Arrays.toString(arr));
    moveZerosEfficient(arr, n);
    moveZeros(arr, n);
    System.out.println(Arrays.toString(arr));
  }

  static void moveZeros(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        for (int j = i + 1; j < n; j++) {
          if (arr[j] != 0) {
            swap(arr, i, j);
          }
        }
      }
    }
    // Time Complexity of the moveZeros function is O(n^2) and Space Complexity is
    // O(1).
  }

  static void moveZerosEfficient(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        swap(arr, i, count);
        count++;
      }
    }
    // Time Complexity of the moveZeros function is O(n) and Space Complexity is
    // O(1)
  }

  static void swap(int[] A, int a, int b) {
    int temp = A[a];
    A[a] = A[b];
    A[b] = temp;
  }
}
