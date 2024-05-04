package SolvedProblems.Conditional_Loops;

import java.util.Scanner;

import Tools.Tools;

public class Reversed_string {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter a number or string :: ");
        String str = in.next();
        String revStr = "";
        int strLength = str.length();

        for (int i = strLength - 1; i >= 0; --i) {
            revStr += str.charAt(i);
        }

        System.out.println("Reversed string :" + revStr);
    }
}
