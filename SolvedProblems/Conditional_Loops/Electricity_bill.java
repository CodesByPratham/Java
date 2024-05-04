package SolvedProblems.Conditional_Loops;

import java.util.Scanner;
import Tools.Tools;

public class Electricity_bill {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        // User input for present readings :-
        float consumed_units = 0.00f, present_readings, previous_readings = 0.00f;
        System.out.print("Enter present readings :: ");
        present_readings = in.nextFloat();
        consumed_units = present_readings - previous_readings;

        // Energy charges :-
        float energy_charges;
        if (consumed_units >= 0 && consumed_units <= 50) {
            energy_charges = 3.20f * consumed_units;
        } else if (consumed_units >= 51 && consumed_units <= 200) {
            energy_charges = 3.95f * consumed_units;
        } else {
            energy_charges = 5.00f * consumed_units;
        }
        System.out.printf("\nEnergy charges                                     %.2f", energy_charges);

        // FPPPA charges :-
        float FPPPA_charges;
        FPPPA_charges = 2.61f * consumed_units;
        System.out.printf("\nFPPPA charges                                      %.2f", FPPPA_charges);

        // Fixed charges :-
        float fixed_charges;
        if (consumed_units >= 0 && consumed_units <= 50) {
            fixed_charges = 25.00f;
        } else if (consumed_units >= 51 && consumed_units <= 200) {
            fixed_charges = 50.00f;
        } else {
            fixed_charges = 80.00f;
        }
        System.out.printf("\nFixed charges                                      %.2f", fixed_charges);

        // Total amount without government duties
        float amt_without_govt_duties;
        amt_without_govt_duties = energy_charges + FPPPA_charges + fixed_charges;
        System.out.printf("\nTotal amount without goverment duties              %.2f", amt_without_govt_duties);

        // partition :-
        System.out.print("\n---------------------------------------------------------------");

        // Government duties :-
        float govt_duties;
        govt_duties = amt_without_govt_duties * 0.15f;
        System.out.printf("\nGoverment duties                                   %.2f", govt_duties);

        // Bill amount with government duties :-
        float amt_with_govt_charges;
        amt_with_govt_charges = govt_duties + amt_without_govt_duties;
        System.out.printf("\nAmount with goverment duties                       %.2f", amt_with_govt_charges);

        // Previous dues, delayed payment charges :-
        System.out.printf("\nPrevious dues                                      " + 0.00f);
        System.out.printf("\nDelayed payment charges                            " + 0.00f);

        // Partition :-
        System.out.print("\n---------------------------------------------------------------");

        // Total amount due :-
        System.out.printf("\nTotal amount due                                   " + amt_with_govt_charges);
    }
}
