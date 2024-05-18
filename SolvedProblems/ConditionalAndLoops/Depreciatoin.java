package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner;

import Tools.Tools;

public class Depreciatoin {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Tools.clear();

        System.out.print("Enter the price of asset :: ");
        long price_of_asset = in.nextLong();
        System.out.print("Enter the residue value of asset :: ");
        long residue_value = in.nextLong();
        System.out.print("Enter the life span of asset :: ");
        long life_span_of_asset = in.nextLong();

        long depreciation = ((price_of_asset - residue_value) / life_span_of_asset);

        System.out.println("Depreciation = " + depreciation);
    }
}
