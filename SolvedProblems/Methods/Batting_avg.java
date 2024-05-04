package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Batting_avg {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter the total runs scored by player :: ");
        int total_runs = in.nextInt();
        System.out.print("Enter the number of times player got out :: ");
        int total_out = in.nextInt();

        batAvg(total_runs, total_out);
    }

    static void batAvg(int tr, int to) {
        float batting_avg = (tr / to);
        System.out.printf("Batting Average : %.2f", batting_avg);
    }
}
