package Concepts;

import java.util.Arrays;
import java.util.Scanner;
import Tools.Tools;

public class JavaArrays {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        // one dimensional array.
        // syntax:-
        // datatype[] variable name = new datatype[size]
        int[] num = new int[5];

        int[] num2 = { 10, 20, 30, 40, 50 };

        // array declaration. num3 is getting defined in stack memory.
        int[] num3;

        // array initialization. actually here the object is being created in the heap
        // memory.
        num3 = new int[5];

        System.out.println(num[0]);
        System.out.println(num2[0]);
        System.out.println(num3[0]);

        // array of numbers.
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        // array of objects.
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {

            names[i] = in.next();
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);
        }

        System.out.println(Arrays.toString(names));

        // enhanced for loop for one dimensional array.
        for (int n : arr) {

            System.out.println(n);
        }

        for (String naam : names) {

            System.out.println(naam);
        }

        // two dimensional array.
        // syntax:-
        // datatype [][] variable_name = new datatype[row_size][column_size].
        int[][] arr2 = new int[3][];
        System.out.println(arr2[0][0]);

        int[][] arr3 = {
                { 1, 2, 3 }, // 0th index.
                { 4, 5, 6 }, // 1st index.
                { 7, 8, 9 }// 2nd index.
        };
        System.out.println(arr3[0][0]);

        // input and printing of two dimensional array.
        int[][] arr4 = new int[3][3];

        for (int row = 0; row < arr4.length; row++) {

            for (int col = 0; col < arr4[row].length; col++) {

                arr4[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr4.length; row++) {

            for (int col = 0; col < arr4[row].length; col++) {

                System.out.print(arr4[row][col] + " ");
            }

            System.out.println();
        }

        for (int row = 0; row < arr4.length; row++) {

            System.out.println(Arrays.toString(arr4[row]));
        }

        // enhanced for loop for two dimensional array.
        for (int[] arr5 : arr3) {

            System.out.println(Arrays.toString(arr5));
        }

        // array for undefined column size.
        int[][] arr6 = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };

        for (int[] arrn : arr6) {

            System.out.println(Arrays.toString(arrn));
        }

        for (int row = 0; row < arr6.length; row++) {

            for (int col = 0; col < arr6[row].length; col++) {

                System.out.print(arr6[row][col] + " ");
            }

            System.out.println();
        }
    }
}