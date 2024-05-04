package SolvedProblems.Conditional_Loops;

import java.util.Scanner;
import Tools.Tools;

public class Sum_till_zero {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        int number, sum = 0;
        do {
            Tools.clear();
            System.out.print("\nEnter a number to add || Enter 0 to exit :: ");
            number = in.nextInt();

            sum += number;

            System.out.println("Sum is " + sum);
            Tools.pause();
        } while (number != 0);
    }
}