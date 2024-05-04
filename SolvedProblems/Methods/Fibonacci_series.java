package SolvedProblems.Methods;

import java.util.Scanner;

public class Fibonacci_series {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number of elements you want to display: ");
        int n = in.nextInt();

        printSeries(n);
    }

    public static void printSeries(int n ){
        int previous = 0, present = 1;
        System.out.println("0 \n1");

        for (int i = 1; i < n-1; i++) {
            int temp = present;
            present = previous + present;
            System.out.println(present);
            previous = temp;    
        }
    }
}