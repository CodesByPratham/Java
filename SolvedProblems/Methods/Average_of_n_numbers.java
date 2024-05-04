package SolvedProblems.Methods;

import java.util.Scanner;
import Tools.Tools;

public class Average_of_n_numbers {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter the number of values you want average of :: ");
        int n = in.nextInt();

        avg(n);
    }

    static void avg(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + " number :: ");
            int number = in.nextInt();
            sum += number;
        }
        System.out.println("Average of all the entered number is " + (sum / n));
    }

}
