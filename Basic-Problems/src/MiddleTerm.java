import java.util.Scanner;

public class MiddleTerm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number 1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter Number 2: ");
    int num2 = sc.nextInt();
    System.out.print("Enter Number 3: ");
    int num3 = sc.nextInt();
    if (num1 > num2) {
      System.out.println("First number is middle.");
    } else if (num1 > num3) {
      System.out.println("Second number is middle.");
    } else {
      System.out.println("Third number is middle.");
    }
    sc.close();
  }
}
