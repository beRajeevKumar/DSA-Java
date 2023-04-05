public class DivByFour {
    public static void main(String[] args) {
        System.out.println(divisibleBy4("1124"));
    }

    static int divisibleBy4(String N) {
        // Your Code Here
        if (N.length() < 3) {
            int val = Integer.parseInt(N);
            if (val % 4 == 0)
                return 1;
            else
                return 0;
        } else {
            String lastDigits = N.substring(N.length() - 3);
            int val = Integer.parseInt(lastDigits);
            if (val % 4 == 0)
                return 1;
            else
                return 0;
        }
    }
}
// Here is the link of the Problem:--
// https://practice.geeksforgeeks.org/problems/check-if-divisible-by-43813/1