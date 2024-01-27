import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number to check Palindrome: ");
    int num = sc.nextInt();
    int temp = num;
    int reverse = 0;
    while (temp != 0) {
      int digit = temp % 10;
      reverse = reverse * 10 + digit;
      temp /= 10;
    }
    if (reverse == num) {
      System.out.println("Entered Number is Palindrome.");
    } else {
      System.out.println("Entered Number is not Palindrome.");
    }
    sc.close();
  }
}
