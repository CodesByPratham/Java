package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Min_max {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter the first number :: ");
        int a = in.nextInt();

        System.out.print("Enter the second number :: ");
        int b = in.nextInt();

        System.out.print("Enter the second number :: ");
        int c = in.nextInt();

        System.out.println("Min is " + min(a, b, c));
        System.out.println("Max is " + max(a, b, c));

    }

    private static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
