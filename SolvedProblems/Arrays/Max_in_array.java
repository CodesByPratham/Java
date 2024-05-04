package SolvedProblems.Arrays;

import java.util.Scanner;

import Tools.Tools;

public class Max_in_array {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = in.nextInt();
        }

        System.out.println("Maximum within array is : " + max(arr));
    }

    static int max(int ar[]) {
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

}
