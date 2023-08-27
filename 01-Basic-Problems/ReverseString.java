public class ReverseString {
  public static void main(String[] args) {
    System.out.println(reverseWord("Geeks"));
  }

  public static String reverseWord(String str) {
    // Reverse the string str
    System.out.println(str.length());
    String revStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      revStr += str.charAt(i);
    }
    return revStr;
  }
}
