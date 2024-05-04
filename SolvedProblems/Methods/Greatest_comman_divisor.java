package SolvedProblems.Methods;

import java.util.Scanner;

public class Greatest_comman_divisor {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter a number: ");
        int b = in.nextInt();

        int gcd = getGcd(a, b);

        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
    }

    public static int getGcd(int a, int b) {

        int n = a < b ? a : b;

        int gcd = 0;

        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
