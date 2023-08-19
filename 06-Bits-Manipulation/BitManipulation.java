public class BitManipulation {
  public static void main(String[] args) {
    System.out.println();
    // bitManipulation(8, 1);
    bitManipulation(70, 3);

  }

  static void bitManipulation(int num, int i) {
    // Get a bit
    // System.out.println(((num >> (i - 1)) & 1));
    // Set a bit
    // System.out.println();
    System.out.print((num >> (i - 1) & 1) + " " + (num | (1 << (i - 1))) + " " + (num & ~(1 << (i - 1))));
  }
}