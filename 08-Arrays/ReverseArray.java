import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    // int arr[] = { 10, 20, 30, 40, 50 };
    int arr[] = { 10, 5, 7, 30 };
    int n = arr.length;
    reverseArray(arr, n);
    System.out.println("Reversed Array is: " + Arrays.toString(arr));
  }

  static int[] reverseArray(int arr[], int n) {
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }
    return arr;
  }
  // The Time Complexity of the above function is Theta(n).
  // The Auxiliary Space of the above function is Theta(1).
}
