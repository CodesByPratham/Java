package SolvedProblems.Methods;

import java.util.Scanner;
import Tools.Tools;

public class Calculator {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        do {
            Tools.clear();
            System.out.println("\nCALCULATOR");
            System.out.println(
                    "Enter + for sum.\nEnter - for diffrence.\nEnter * for product.\nEnter / for quotient.\nEnter % for remainder.\nEnter x for exit.");
            System.out.print("Enter an operator :: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                calc(op);
            } else {
                break;
            }
        } while (true);
    }

    static void calc(char op) {

        System.out.print("Enter two numbers :: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;

        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            ans = num1 / num2;
        } else if (op == '%') {
            ans = num1 % num2;
        } else {
            System.out.print("Enter a valid oprator.");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        Tools.pause();
    }
}
