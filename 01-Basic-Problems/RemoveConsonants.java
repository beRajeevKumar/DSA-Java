public class RemoveConsonants {
  public static void main(String[] args) {
    String ans = "";
    String S = "abEkipo";
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' ||
          S.charAt(i) == 'o' || S.charAt(i) == 'u' || S.charAt(i) == 'A' ||
          S.charAt(i) == 'E' || S.charAt(i) == 'I' || S.charAt(i) == 'O' || S.charAt(i) == 'U') {
        ans += S.charAt(i);
      }
    }
    System.out.println(ans);
  }
}
