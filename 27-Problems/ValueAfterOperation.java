class ValueAfterOperation {
  public static void main(String[] args) {
    String arr[] = { "--X", "X++", "X++" };
    System.out.println(finalValueAfterOperations(arr));
  }

  static int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (int i = 0; i < operations.length; i++) {
      if (operations[i].equals("++X") || operations[i].equals("X++"))
        x++;
      else
        x--;
    }
    return x;

  }
}
// Here is the link of the Problem:--
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/