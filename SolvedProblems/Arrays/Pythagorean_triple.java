package SolvedProblems.Arrays;
/*Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that 
satisfies a2 + b2 = c2.*/

/*Input: arr[] = {3, 1, 4, 6, 5} 
Output: True 
There is a Pythagorean triplet (3, 4, 5).
Input: arr[] = {10, 4, 6, 12, 5} 
Output: False 
There is no Pythagorean triplet.*/



import java.util.Scanner;

import Tools.Tools;

public class Pythagorean_triple {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        int i = 0, j = 0, k = 0, flag = 0, x = 0, y = 0, z = 0;

        int n = 5;
        int[] arr = { 3, 1, 4, 6, 5 };

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                for (k = j + 1; k < n; k++) {

                    x = arr[i] = arr[i];
                    y = arr[j] = arr[j];
                    z = arr[k] = arr[k];

                    if ((x == y + z) || (y == z + x) || (z == x + y)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1)
                    break;
            }
            if (flag == 1)
                break;
        }

        if (flag == 1) {
            System.out.println("true (" + x + " " + y + " " + z + ")");
        } else {
            System.out.println("false");
        }
    }

}
