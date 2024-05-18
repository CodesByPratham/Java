package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner; 
import Tools.Tools;

public class Palindrome {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                             

        System.out.print("Enter a number or string :: ");
        String str = in.next();
        String revStr = "";
        int strLength = str.length();

        for (int i = strLength - 1; i >= 0; --i) {
            revStr = revStr + str.charAt(i);
        }

        if (str.equals(revStr)) {
            System.out.println("Entered string or number is palindrome.");
        } else {
            System.out.println("Entered string or number is not palindrome.");
        }
    }
}
