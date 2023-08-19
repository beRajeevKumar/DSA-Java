// import java.util.Scanner;

public class addComplexNumbers {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the real value of first complex number");
    // int a = sc.nextInt();
    // System.out.println("Enter the imaginary value of first complex number");
    // int b = sc.nextInt();
    // System.out.println(a + b);
    // sc.close();
    System.out.println(findXandY(2, 3, 7));
  }

  static int[] findXandY(int A, int B, int N) {
    // code here
    int ans[] = new int[2];
    int x = 0, y = 0;
    for (int i = 1; i <= N; i++) {
      if (A * x + B * y == N) {
        ans[0] = y;
        ans[1] = x;
      } else {
        y++;
        x++;
      }
    }
    return ans;
  }
}
