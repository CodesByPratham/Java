package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Odd_even {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter the days you want to go out (odd || even) :: ");
        String day = in.next();

        System.out.print("Enter the month :: ");
        String month = in.next();

        switch (month) {
            case "january":
                odd(31, day);
                break;

            case "febuary":
                odd(28, day);
                break;

            case "march":
                odd(31, day);
                break;

            case "april":
                odd(30, day);
                break;

            case "may":
                odd(31, day);
                break;

            case "june":
                odd(30, day);
                break;

            case "july":
                odd(31, day);
                break;

            case "august":
                odd(31, day);
                break;

            case "september":
                odd(30, day);
                break;

            case "october":
                odd(31, day);
                break;

            case "november":
                odd(30, day);
                break;

            case "december":
                odd(31, day);
                break;

            default:
                System.out.println("Enter a valid month.");
        }
    }

    static void odd(int m, String d) {
        if (d.equals("odd")) {
            System.out.print("Odd days are :- \n");
            for (int i = 1; i <= m; i++) {
                if (i % 2 != 0) {
                    System.out.print("\t" + i);
                }
            }
        } else {
            System.out.print("Even days are :- \n");
            for (int i = 1; i <= m; i++) {
                if (i % 2 == 0) {
                    System.out.print("\t" + i);
                }
            }
        }
    }
}
