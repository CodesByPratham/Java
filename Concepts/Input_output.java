package Concepts;

import java.util.Scanner;
import Tools.Tools;

public class Input_output {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Tools.clear();

        System.out.print("Enter your first name :: ");
        String fname = in.next();

        System.out.print("Enter your last name :: ");
        String lname = in.next();

        System.out.print("Enter your Roll.no :: ");
        int roll_no = in.nextInt();

        System.out.println("Your roll.no : " + roll_no);
        System.out.print("Your name : " + fname + " " + lname);
    }
}
