import java.util.Arrays;

public class LeftRotateOnePlace {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    System.out.println(Arrays.toString(arr));
    leftRotatebyOne(arr, n);
    System.out.println(Arrays.toString(arr));
  }

  static void leftRotatebyOne(int[] arr, int n) {
    int temp = arr[0];
    for (int i = 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    arr[n - 1] = temp;
  }
  // The Time Complexity of the above function is Theta(n).
  // The Space Complexity of the above function is Theta(1).
}
