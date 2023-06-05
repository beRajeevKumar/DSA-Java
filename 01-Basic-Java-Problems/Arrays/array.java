package Arrays;

public class array {
  public static void main(String[] args) {
    // int array = new[] int[5];
    // int array []= int[5] new;
    // int arr[2];
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(2 / 3);
    int a[] = { 1, 2, 3, 4, 5 };
    int n = a.length;
    countOddEven(a, n);

  }

  static void countOddEven(int a[], int n) {

    // Your code here
    int countEven = 0;
    int countOdd = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) {
        countEven++;
      } else {
        countOdd++;
      }
    }
    System.out.print(countOdd + " " + countEven);
  }
}
