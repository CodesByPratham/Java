package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Factorial {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter a number you want factorial of :: ");
        int num = in.nextInt();

        System.out.println(num + "! = " + fact(num));

    }

    static int fact(int num) {

        if (num == 1) {
            return 1;
        }
        if (num == 0) {
            return 0;
        } else {
            return (num * fact(num - 1));
        }
    }
}
