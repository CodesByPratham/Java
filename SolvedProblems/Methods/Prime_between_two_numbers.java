package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Prime_between_two_numbers {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter first number :: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number :: ");
        int num2 = in.nextInt();

        prime(num1, num2);

    }

    static void prime(int n1, int n2) {

        for (int i = n1; i <= n2; i++) {
            if (i == 1)
                continue;
                
            int flag = 0;
            for (int j = 2; j != i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("\t" + i);
            }
        }
    }
}
