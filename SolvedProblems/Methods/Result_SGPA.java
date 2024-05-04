package SolvedProblems.Methods;


import java.util.Scanner;

import Tools.Tools;

public class Result_SGPA {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("\nEnter the name :: ");
        String name = in.nextLine();
        System.out.print("\nEnter the roll no :: ");
        int roll_no = in.nextInt();
        System.out.print("\nEnter seat no :: ");
        int seat_no = in.nextInt();
        System.out.print("\nEnter the date :: ");
        String exam_date = in.next();
        System.out.print("\nEnter the total number of subjects :: ");
        int total_subjects = in.nextInt();

        String[] subject = new String[total_subjects];
        int[] marks = new int[total_subjects];
        int total_marks = 0;
        float total_GP = 0;

        for (int i = 0; i < total_subjects; i++) {

            System.out.print("\nEnter the " + (i + 1) + " subject :: ");
            subject[i] = in.nextLine();
            subject[i] = in.nextLine();
            System.out.print("Enter the " + (i + 1) + " subject marks :: ");
            marks[i] = in.nextInt();
            total_marks += marks[i];
        }

        Tools.clear();

        System.out.println("\t\t\t\t\t\t\tBachlore of Computer Applications");
        System.out.println("\nSeat no.:" + seat_no + "\t   \tName : " + name + "\t   \tRoll no.: " + roll_no
                + "\t   \tCollege : " + "LCCA" + "\t   \t\tHeld on :" + exam_date);
        System.out.println(
                "\n--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\tSUBJECT\t\t\t\tMARKS\t\t\tGRADE\t\t\tGP\t\t\tREMARKS");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------");

        for (int j = 0; j < total_subjects; j++) {

            System.out.print("\t\t");
            System.out.print(subject[j]);

            System.out.print("\t\t\t");
            System.out.print(marks[j]);

            System.out.print("\t\t\t");
            grade(marks[j]);

            System.out.print("\t\t\t");
            float GP = (float) (marks[j]);
            System.out.print(GP / 10);
            total_GP += (GP / 10);

            System.out.print("\t\t\t");
            remarks(marks[j]);

            System.out.println("");
        }

        System.out.println(
                "\n--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("TOTAL :\t\t\t\t\t\t" + total_marks);
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("RESULT : ");
        float SGPA = total_GP / total_subjects;
        classification_of_final_result(SGPA);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\tSGPA : %.2f", SGPA);
        System.out.println(
                "\n--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n\n\n\n\n\n\n");
    }

    static void grade(int marks) {

        if (marks <= 36) {
            System.out.print("D");
        } else if (marks >= 37 && marks <= 47) {
            System.out.print("C");
        } else if (marks >= 48 && marks <= 54) {
            System.out.print("B");
        } else if (marks >= 55 && marks <= 60) {
            System.out.print("B+");
        } else if (marks >= 61 && marks <= 70) {
            System.out.print("A");
        } else if (marks >= 71 && marks <= 85) {
            System.out.print("O");
        } else if (marks >= 85 && marks <= 100) {
            System.out.print("O+");
        }
    }

    static void remarks(int marks) {

        if (marks <= 36) {
            System.out.print("FAIL");
        } else if (marks >= 37 && marks <= 47) {
            System.out.print("AVERAGE");
        } else if (marks >= 48 && marks <= 54) {
            System.out.print("FAIR");
        } else if (marks >= 55 && marks <= 60) {
            System.out.print("GOOD");
        } else if (marks >= 61 && marks <= 70) {
            System.out.print("VERY GOOD");
        } else if (marks >= 71 && marks <= 85) {
            System.out.print("EXCELLENT");
        } else if (marks >= 85 && marks <= 100) {
            System.out.print("OUTSTANDING");
        }
    }

    static void classification_of_final_result(float sgpa) {

        if (sgpa < 3.5) {
            System.out.print("DROPPED");
        } else if (sgpa >= 3.6 && sgpa <= 4.7) {
            System.out.print("PASS CLASS");
        } else if (sgpa >= 4.8 && sgpa <= 5.4) {
            System.out.print("SECOND CLASS");
        } else if (sgpa >= 5.5 && sgpa <= 5.9) {
            System.out.print("HIGHER SECOND CLASS");
        } else if (sgpa >= 6.0 && sgpa <= 6.9) {
            System.out.print("FIRST CLASS");
        } else if (sgpa >= 7.0 && sgpa <= 10.0) {
            System.out.print("FIRST CLASS WITH DISTICNTION");
        }
    }
}
