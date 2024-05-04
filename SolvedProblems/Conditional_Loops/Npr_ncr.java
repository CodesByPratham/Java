package SolvedProblems.Conditional_Loops;

import java.util.Scanner;

import Tools.Tools;

public class Npr_ncr {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter n :: ");
        int n = in.nextInt();
        System.out.print("Enter r :: ");
        int r = in.nextInt();

        long n_fact = 1, r_fact = 1, n_minus_r_fact = 1;
        int n_minus_r = n - r;

        for (int i = n; i > 0; i--) {
            n_fact *= i;
        }
        for (int i = r; i > 0; i--) {
            r_fact *= i;
        }
        for (int i = n_minus_r; i > 0; i--) {
            n_minus_r_fact *= i;
        }

        long npr = (n_fact / n_minus_r_fact);

        long ncr = (n_fact / (r_fact * n_minus_r_fact));

        System.out.println("\nnPr = " + npr);
        System.out.println("nCr = " + ncr);
    }
}