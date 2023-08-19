import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largestAmongThree {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter First Number: ");
      int num1 = sc.nextInt();
      System.out.println("Enter Second Number: ");
      int num2 = sc.nextInt();
      System.out.println("Enter Third Number: ");
      int num3 = sc.nextInt();

      // if (num1 > num2 && num1 > num3) {
      // System.out.println("First Number is the Largest");
      // } else if (num2 > num1 && num2 > num3) {
      // System.out.println("Second Number is the Largest");
      // } else {
      // System.out.println("Third Number is the Largest");
      // }

      // greater(num1, num2, num3);

      largestNumber(num1, num2, num3);
    }
  }

  // We also can solve this problem using the ternery operator in java.
  static void largestNumber(int num1, int num2, int num3) {
    // int max = (num1 > num2) ? num1 : num2;
    int result = (((num1 > num2) ? num1 : num2) > num3) ? ((num1 > num2) ? num1 : num2) : num3;
    System.out.println(result + " is the Largest number among the three numbers.");
  }

  // We also can solve this problem using collections in java.
  static void greater(int num1, int num2, int num3) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(num1);
    list.add(num2);
    list.add(num3);
    System.out.println(Collections.max(list) + " is the Largest number among three.");
  }

}