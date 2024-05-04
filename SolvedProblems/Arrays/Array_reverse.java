package SolvedProblems.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import Tools.Tools;

public class Array_reverse {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        System.out.print("Enter numeber of elements you want to enter :: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element :: ");
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        reverse(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int n) {
        int low = 0, high = n - 1, temp;
        int mid = n / 2;

        while (low != mid) {

            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
