public class OddOccurences {
  public static void main(String[] args) {
    int arr[] = { 7, 3, 7, 7, 7 };
    int n = arr.length;
    findOddOccurences(arr, n);
    System.out.println(findOddOccurences(arr, n));
    System.out.println(findOdd(arr, n));
  }

  // Naive Solution
  static int findOddOccurences(int arr[], int n) {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j])
          count++;
      }
      if (count % 2 != 0)
        return arr[i];
    }
    return 0;
  }

  static int findOdd(int[] arr, int n) {
    int res = arr[0];
    for (int i = 1; i < n; i++) {
      res = res ^ arr[i];
    }
    return res;
  }
}