package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner;

import Tools.Tools;

public class Sum_of_positive_negative {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        int n;
        long sum_of_negative = 0, sum_of_odd_positive = 0, sum_of_even_positive = 0;
        do {
            System.out.println("Enter numbers || Enter 0 to exit :-");
            n = in.nextInt();
            if (n < 0) {
                sum_of_negative += n;
            } else {
                if (n % 2 == 0) {
                    sum_of_even_positive += n;
                } else {
                    sum_of_odd_positive += n;
                }
            }
        } while (n != 0);

        System.out.println("Sum of negative numbers : " + sum_of_negative);
        System.out.println("sum of positive odd numbers : " + sum_of_odd_positive);
        System.out.println("Sum of positive even numbers : " + sum_of_even_positive);
    }
}
