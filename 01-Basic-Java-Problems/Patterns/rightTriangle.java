public class rightTriangle {
  public static void main(String[] args) {
    // System.out.println("Enter the value of N to print Right Triangle");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)

    // recursion call
    rightTriangle.changeRow(5);
  }
  // We also can solve this problem by using recursion

  public static void printRow(int n) // for printing a row
  {
    if (n == 0) {
      return;
    }
    System.out.print("* ");
    printRow(n - 1); // for next * in the current row
  }

  public static void changeRow(int n) // for moving to next row...n = 1 means last row
  {
    if (n == 0) {
      return;
    }
    changeRow(n - 1);
    printRow(n); // when call stack of changeRow method is popping out we will print row
    System.out.print("\n"); // new line after each column
  }

  // Time Complexity : O(n^2)
  // Space Complexity : O(n^2)
}

// Link to solve the Right Triangle pattern problem on GFG
// https://www.geeksforgeeks.org/java-program-to-print-right-triangle-star-pattern/