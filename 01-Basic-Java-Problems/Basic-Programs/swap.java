public class swap {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    System.out.println("Before Swap: " + num1 + " " + num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("After Swap: " + num1 + " " + num2);
  }
}
