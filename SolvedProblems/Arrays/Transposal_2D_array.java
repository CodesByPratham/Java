package SolvedProblems.Arrays;

public class Transposal_2D_array {
    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10 + (int) (Math.random() * ((99 - 10) + 1));
            }
        }

        System.out.println("The Original Array:- ");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[][] temp = new int[n][m];

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = arr[j][i];
            }
        }
        System.out.println();
        for (int[] i : temp) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
