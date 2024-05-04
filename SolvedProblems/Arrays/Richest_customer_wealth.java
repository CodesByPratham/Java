package SolvedProblems.Arrays;

import Tools.Tools;

public class Richest_customer_wealth {

    public static void main(String[] args) {
        Tools.clear();

        int[][] accounts = {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 }
        };

        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {

                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
