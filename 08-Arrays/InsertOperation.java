import java.util.Arrays;

public class InsertOperation {
  public static void main(String[] args) {
    int arr[] = new int[5], cap = 5, n = 3;

    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 20;

    System.out.println("Before Insertion");

    System.out.println(Arrays.toString(arr));

    int x = 7, pos = 2;

    n = insert(arr, n, x, cap, pos);

    System.out.println("After Insertion");

    System.out.println(Arrays.toString(arr));
  }

  // capacity: no of elements can be filled
  static int insert(int arr[], int n, int x, int cap, int pos) {
    if (n == cap)
      return n; // no space to insert

    int idx = pos - 1;

    for (int i = n - 1; i >= idx; i--) {
      arr[i + 1] = arr[i];
    }

    arr[idx] = x;

    return n + 1;
  }
}
