package Concepts;

import java.util.Scanner;

public class Strings {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Important Note: Strings are Immutable.

        // Concatenation
        System.out.print("Enter your first name: ");
        String firstName = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is " + fullName);

        // length() function to print length of the string.
        System.out.println("Length of full name is " + fullName.length());

        // charAt() function to access a specific character using it's index.
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compareTo() function is used to compare two strings
        // The function compares the following cases:-
        // 1. strA > strB : +ve value
        // 2. strA == strB : 0 as value
        // 3. strA < strB : -ve value
        String strA = "Pratham";
        String strB = "Pratham";
        System.out.println(strA.compareTo(strB));

        // substring() function to extract a part of a string.
        // Takes two argumnets one begining index and another ending index of the part
        // of string.
        String sentence = "My Name is Pratham Rahtod";
        String name = sentence.substring(11, 19);
        String fname = sentence.substring(11, sentence.length());
        System.out.println("Name " + name);
        System.out.println("Full Name: " + fname);

    }
}