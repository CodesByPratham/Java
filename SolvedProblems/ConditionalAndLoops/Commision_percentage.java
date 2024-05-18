package SolvedProblems.ConditionalAndLoops;

import Tools.Tools;
import java.util.Scanner; 

public class Commision_percentage {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                           
        
        float commission_percentage, sale_price, commission_amount;
        int ch;

        do {

            System.out.println("\nCOMMISSION CALCULATOR");
            System.out.println("\n1. Commission Percentage \n2. Commission Amount  \n3. Sale Price \n0. Exit");
            System.out.print("Enter your choice :: ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter commission amount :: ");
                    commission_amount = in.nextFloat();
                    System.out.print("Enter sale price :: ");
                    sale_price = in.nextFloat();
                    commission_percentage = ((commission_amount / sale_price) * 100);
                    System.out.println("\nRESULTS");
                    System.out.printf("\nCommission Percentage : %.2f %%", commission_percentage);
                    System.out.println("\nPrice added commission : " + (sale_price + commission_amount));
                    System.out.println("Price subtracted commission : " + (sale_price - commission_amount));
                    break;

                case 2:
                    System.out.print("Enter commission percentage :: ");
                    commission_percentage = in.nextFloat();
                    System.out.print("Enter  sale price :: ");
                    sale_price = in.nextFloat();
                    commission_amount = ((commission_percentage / 100) * sale_price);
                    System.out.println("\nRESULTS");
                    System.out.printf("Commission Amount : %.2f", commission_amount);
                    System.out.println("\nPrice added commission : " + (sale_price + commission_amount));
                    System.out.println("Price subtracted commission : " + (sale_price - commission_amount));
                    break;

                case 3:
                    System.out.print("Enter commission percentage:: ");
                    commission_percentage = in.nextFloat();
                    System.out.print("Enter commission amount :: ");
                    commission_amount = in.nextFloat();
                    sale_price = ((100 * commission_amount) / commission_percentage);
                    System.out.println("\nRESULTS");
                    System.out.printf("Sale Price : %.2f", sale_price);
                    System.out.println("\nPrice added commission : " + (sale_price + commission_amount));
                    System.out.println("Price subtracted commission : " + (sale_price - commission_amount));
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
}
