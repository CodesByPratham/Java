package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Commision_percentage {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        int ch;

        do {
            Tools.clear();
            System.out.println("\nCOMMISSION CALCULATOR");
            System.out.println("\n1. Commission Percentage \n2. Commisson Amount  \n3. Sale Price \n0. Exit");
            System.out.print("Enter your choice :: ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    comper();
                    break;

                case 2:
                    comamt();
                    break;

                case 3:
                    salepri();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }
            Tools.pause();
        } while (ch != 0);
    }

    private static void salepri() {
        System.out.print("Enter commission percentage:: ");
        float commision_percentage = in.nextFloat();
        System.out.print("Enter commission amount :: ");
        float commision_amount = in.nextFloat();
        float sale_price = ((100 * commision_amount) / commision_percentage);
        System.out.println("\nRESULTS");
        System.out.printf("Sale Price : %.2f", sale_price);
        System.out.println("\nPrice added commission : " + (sale_price + commision_amount));
        System.out.println("Price substracted commission : " + (sale_price - commision_amount));
    }

    private static void comamt() {
        System.out.print("Enter commision percentage :: ");
        float commision_percentage = in.nextFloat();
        System.out.print("Enter  sale price :: ");
        float sale_price = in.nextFloat();
        float commision_amount = ((commision_percentage / 100) * sale_price);
        System.out.println("\nRESULTS");
        System.out.printf("Commission Amount : %.2f", commision_amount);
        System.out.println("\nPrice added commission : " + (sale_price + commision_amount));
        System.out.println("Price subtracted commission : " + (sale_price - commision_amount));
    }

    static void comper() {
        System.out.print("Enter commission amount :: ");
        float commision_amount = in.nextFloat();
        System.out.print("Enter sale price :: ");
        float sale_price = in.nextFloat();
        float commision_percentage = ((commision_amount / sale_price) * 100);
        System.out.println("\nRESULTS");
        System.out.printf("\nCommission Percentage : %.2f %%", commision_percentage);
        System.out.println("\nPrice added commission : " + (sale_price + commision_amount));
        System.out.println("Price subtracted commission : " + (sale_price - commision_amount));
    }
}
