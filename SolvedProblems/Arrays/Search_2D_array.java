package SolvedProblems.Arrays;

import java.util.Scanner;

class Search_2D_array {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();

        int[][] arr = getElements(rows, cols);

        searchElement(arr);
    }

    public static int[][] getElements(int i, int j) {
        int[][] arr = new int[i][j];

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the value for Array[" + i + "][" + j + "]: ");
                arr[i][j] = in.nextInt();
            }
        }

        return arr;
    }

    public static void searchElement(int[][] arr) {
        System.out.println("Enter the number to search: ");
        int n = in.nextInt();

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    flag = true;
                    System.out.println("Element found at Array[" + i + "][" + j + "].");
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }

        if (flag == false) {
            System.out.println("No such element found.");
        }
    }
}