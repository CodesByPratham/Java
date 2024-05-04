package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Electricity_bill {
    public static Scanner in = new Scanner(System.in);

    static float energy_charges, FPPPA_charges, fixed_charges, amt_with_govt_charges, amt_without_govt_duties,
            govt_duties;

    public static void main(String[] args) {
        Tools.clear();

        // User input for present readings :-
        float consumed_units = 0.00f, present_readings, previous_readings = 0.00f;
        System.out.print("Enter present readings :: ");
        present_readings = in.nextFloat();
        consumed_units = present_readings - previous_readings;

        // Energy charges :-
        System.out.printf("\nEnergy charges                                     %.2f", energycharges(consumed_units));

        // FPPPA charges :-
        System.out.printf("\nFPPPA charges                                      %.2f", fppacharges(consumed_units));

        // Fixed charges :-
        System.out.printf("\nFixed charges                                      %.2f", fixedcharges(consumed_units));

        // Total amount without goverment duties
        amt_without_govt_duties = energy_charges + FPPPA_charges + fixed_charges;
        System.out.printf("\nTotal amount without goverment duties              %.2f", amt_without_govt_duties);

        // partition :-
        System.out.print("\n---------------------------------------------------------------");

        // Goverment duties :-

        govt_duties = amt_without_govt_duties * 0.15f;
        System.out.printf("\nGoverment duties                                   %.2f", govt_duties);

        // Bill amount with goverment duties :-
        amt_with_govt_charges = govt_duties + amt_without_govt_duties;
        System.out.printf("\nAmount with goverment duties                       %.2f", amt_with_govt_charges);

        // Previous dues, delayed payment charges :-
        System.out.printf("\nPrevious dues                                      " + 0.00f);
        System.out.printf("\nDelayed payment charges                            " + 0.00f);

        // Partition :-
        System.out.print("\n---------------------------------------------------------------");

        // Total amount due :-
        System.out.printf("\nTotal amount due                                   %2f", amt_with_govt_charges);
    }

    static float fixedcharges(float consumed_units) {
        if (consumed_units >= 0 && consumed_units <= 50) {
            fixed_charges = 25.00f;
        } else if (consumed_units >= 51 && consumed_units <= 200) {
            fixed_charges = 50.00f;
        } else {
            fixed_charges = 80.00f;
        }
        return fixed_charges;
    }

    static float fppacharges(float consumed_units) {
        FPPPA_charges = 2.61f * consumed_units;
        return FPPPA_charges;
    }

    static float energycharges(float consumed_units) {
        if (consumed_units >= 0 && consumed_units <= 50) {
            energy_charges = 3.20f * consumed_units;
        } else if (consumed_units >= 51 && consumed_units <= 200) {
            energy_charges = 3.95f * consumed_units;
        } else {
            energy_charges = 5.00f * consumed_units;
        }
        return energy_charges;
    }
}
