package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Sum_till_n {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter the number :: ");
        int num = in.nextInt();

        int sum = num(num);

        System.out.println(sum);
    }

    static int num(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        // s = ((n * (n + 1)) / 2);
        return s;
    }
}
