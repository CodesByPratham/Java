package SolvedProblems.Methods;

import java.util.Scanner;
import Tools.Tools;

public class Armstrong {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter a three digit number :: ");
        int n = in.nextInt();

        int armstNum = armstr(n);

        if (n == armstNum) {
            System.out.println(n + " is an amstrong number.");
        } else {
            System.out.println(n + " isn't an armstrong number.");
        }
    }

    static int armstr(int number) {
        int armstNumber = 0;
        while (number > 0) {
            int temp = number % 10;
            temp = temp * temp * temp;
            armstNumber += temp;
            number /= 10;
        }
        return armstNumber;
    }
}
