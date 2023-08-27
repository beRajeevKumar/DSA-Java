public class PrintNto1 {
  public static void main(String[] args) {
    printNto1(10);
  }

  // This is a tail recursive function
  static void printNto1(int n) {
    if (n == 0)
      return;
    System.out.print(n + " ");
    printNto1(n - 1);
  }
  // The time complexity of this above function is Theta(n) and the auxillary
  // complexity is Theta(n)
}
