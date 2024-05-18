package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner;

import Tools.Tools;

public class Compound_interest {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter the principal amount :: ");
        float principal_amount = in.nextFloat();

        System.out.print("Enter the rate of interest :: ");
        float rate_of_interest = in.nextInt();

        System.out.print("Enter the time :: ");
        float time = in.nextInt();

        int amount = (int) ((float) principal_amount*(Math.pow((1 + (rate_of_interest / 100)), time)));

        System.out.println("Amount = " + amount);

        int compound_interest = (int) (amount - principal_amount);

        System.out.println("Compound Interest = " + compound_interest);
    }

}
