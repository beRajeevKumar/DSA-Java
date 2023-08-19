public class operators {
  public static void main(String[] args) {
    // System.out.print(a && b + " ");
    // System.out.print(a || b + " ");
    // System.out.print((!a) && (!b));
    logicOp(true, false);
  }

  static void logicOp(boolean a, boolean b) {
    /* output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces */
    System.out.print(a && b);
    System.out.print(" ");
    System.out.print(a || b);
    System.out.print(" ");
    System.out.print((!a) && (!b));
  }
}
