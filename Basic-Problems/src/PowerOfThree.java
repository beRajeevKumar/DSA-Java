public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerof3(81));
    }

    static String isPowerof3(int N) {
        for (int i = 1; i <= N; i = i + (int) Math.pow(3, i)) {
            if ((int) Math.pow(3, i) != N) {
                return "No";
            }
        }
        return "Yes";
    }
}
