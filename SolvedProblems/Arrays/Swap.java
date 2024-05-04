package SolvedProblems.Arrays;

import java.util.Arrays;

import java.util.Scanner;

import Tools.Tools;

public class Swap {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " Element :: ");
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the indexes you want to swap :: ");
        int index1 = in.nextInt();
        int index2 = in.nextInt();

        System.out.println("Before swap :-");
        System.out.println(Arrays.toString(arr));

        array_swap(arr, index1, index2);

        System.out.println("After swap :-");
        System.out.print(Arrays.toString(arr));

    }

    static void array_swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
