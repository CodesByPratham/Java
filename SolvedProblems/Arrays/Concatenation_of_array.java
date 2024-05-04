package SolvedProblems.Arrays;

import java.util.Arrays;

import Tools.Tools;

public class Concatenation_of_array {

    public static void main(String[] args) {
        Tools.clear();

        int[] arr = { 1, 2, 1 };

        int[] dup = new int[arr.length * 2];

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(dup.length);
        System.out.println(Arrays.toString(dup));

        //first method
        // int k = 0;
        // for (int i = 0; i < dup.length; i++) {
        //     dup[i] = arr[k];
        //     if (k == arr.length - 1) {
        //         k = -1;
        //     }
        //     k++;
        // }

        //second method(fastest)
        System.arraycopy(arr, 0, dup, 0, arr.length);
        System.arraycopy(arr, 0, dup, arr.length, arr.length);

        //third method
        // int i = 0, j = 0;
        // while (i < dup.length) {
        //     dup[i] = arr[j];

        //     if (j == arr.length - 1) {
        //         j = -1;
        //     }
        //     i++;
        //     j++;
        // }

        System.out.println(Arrays.toString(dup));

    }

}