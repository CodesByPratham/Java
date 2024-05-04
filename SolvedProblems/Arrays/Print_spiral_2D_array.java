package SolvedProblems.Arrays;

import java.util.Scanner;

public class Print_spiral_2D_array {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 7, n = 7;

        int[][] arr = addElements(m, n);

        printSpiral(arr, m);
    }

    public static int[][] addElements(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10 + (int) (Math.random() * ((99 - 10) + 1));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }

    public static void printSpiral(int[][] arr, int m) {
        int a = 0, b = m - 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = a; j < b; j++) {
                System.out.print(arr[a][j] + " ");
            }

            for (int k = a; k < b; k++) {
                System.out.print(arr[k][b] + " ");
            }

            for (int l = b; l > a; l--) {
                System.out.print(arr[b][l] + " ");
            }

            for (int h = b; h > a; h--) {
                System.out.print(arr[h][a] + " ");
            }

            a++;
            b--;
        }
    }
}
