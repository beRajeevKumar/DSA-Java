import java.util.Arrays;

public class MoveZeros {
  public static void main(String[] args) {
    int[] arr = { 8, 5, 0, 10, 0, 20 };
    int n = arr.length;
    System.out.println(Arrays.toString(arr));
    moveZeros(arr, n);
    System.out.println(Arrays.toString(arr));
  }

  static void moveZeros(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        swap(arr, i, count);
        count++;
      }
    }
  }

  static void swap(int[] A, int a, int b) {
    int temp = A[a];
    A[a] = A[b];
    A[b] = temp;
  }
}
