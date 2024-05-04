package SolvedProblems.Conditional_Loops;

import java.util.Scanner; 
import Tools.Tools;

public class Discount_of_product {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                             

        System.out.print("Enter the MRP to get the discounted price :: ");
        float price = in.nextFloat();

        if (price >= 0 && price <= 100) {
            System.out.println("DISCOUNT : 10% ");
            System.out.println("Price including discount : " + (price - (price * 0.1)));
        } else if (price >= 101 && price <= 200) {
            System.out.println("DISCOUNT : 15% ");
            System.out.println("Price including discount : " + (price - (price * 0.15)));
        } else if (price >= 201 && price <= 300) {
            System.out.println("DISCOUNT : 20% ");
            System.out.println("Price including discount : " + (price - (price * 0.2)));
        } else if (price >= 301 && price <= 400) {
            System.out.println("DISCOUNT : 25% ");
            System.out.println("Price including discount : " + (price - (price * 0.25)));
        } else if (price >= 301 && price <= 500) {
            System.out.println("DISCOUNT : 30% ");
            System.out.println("Price including discount : " + (price - (price * 0.3)));
        } else {
            System.out.println("DISCOUNT : 40% ");
            System.out.println("Price including discount : " + (price - (price * 0.4)));
        }
    }
}
