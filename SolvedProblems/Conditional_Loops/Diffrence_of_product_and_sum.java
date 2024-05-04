package SolvedProblems.Conditional_Loops;

import java.util.Scanner;
import Tools.Tools;

public class Diffrence_of_product_and_sum {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                             

        System.out.print("Enter an int :: ");
        int number = in.nextInt();

        int last_digit = 0, product = 1, sum = 0, result = 0;

        while (number > 0) {
            last_digit = number % 10;
            product *= last_digit;
            sum += last_digit;
            number /= 10;
        }

        result = product - sum;

        System.out.println(result);

    }
}
