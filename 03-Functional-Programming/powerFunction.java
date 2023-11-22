
import java.util.Scanner;

public class PowerFunction {
// Functional Programming is all about to create seperate functions of repetative tasks.
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        calculatePower(base, power);
        sc.close();
    }
    public static void calculatePower(int b, int p) {
        int value = 1;
        for (int i = p; i >= 1; i--) {
            value = value * b;
        }
        System.out.println(value);
    }
}
