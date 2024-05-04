package SolvedProblems.Conditional_Loops;

import java.util.Scanner;

import Tools.Tools;

public class Vowel_consonent {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter a character :: ");
        char a = in.next().charAt(0);

        if (a == 97 || a == 101 || a == 105 || a == 111 || a == 117 || a == 65 || a == 69 || a == 73 || a == 79
                || a == 85) {
            System.out.println("Entered character is a vowel.");
        } else {
            System.out.println("Entered character is consonent.");
        }
    }

}
