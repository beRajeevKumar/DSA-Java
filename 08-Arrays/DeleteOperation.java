import java.util.Arrays;

public class DeleteOperation {
  public static void main(String[] args) {
    int arr[] = { 3, 8, 12, 5, 6 };
    System.out.println(Arrays.toString(arr));// [3, 8, 12, 5, 6]
    int n = arr.length;
    int x = 12;
    System.out.println(deleteElement(arr, n, x));
    System.out.println(Arrays.toString(arr));// [3, 8, 5, 6, 6]
  }

  // This Function return the new size of the array.
  static int deleteElement(int arr[], int n, int x) {
    int i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        break;
      }
    }
    if (i == n)
      return n;

    for (int j = i; j < n - 1; j++) {
      arr[j] = arr[j + 1];
    }

    arr[n - 1] = 0;

    return n - 1;
  }
}
