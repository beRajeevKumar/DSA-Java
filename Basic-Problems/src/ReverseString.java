import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string to reverse: ");
    String str = sc.next();
    System.out.println("The Reverse of your string is: " + reverseWord(str));
    sc.close();
  }

  public static String reverseWord(String str) {
    // Reverse the string str
    String revStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      revStr += str.charAt(i);
    }
    return revStr;
  }
}
