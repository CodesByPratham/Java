package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner;

import Tools.Tools;

public class Perfect_number {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter a number :: ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        sum += n;

        if (sum == (2 * n)) {
            System.out.println("Entered number is perfect");
        } else {
            System.out.println("Entered number is not perfect");
        }
    }
}
