package SolvedProblems.Arrays;

import java.util.Arrays;

import Tools.Tools;

public class Shuffle_the_array {

    public static void main(String[] args) {
        Tools.clear();

        // my method
        int n = 3;
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int[] arrx = new int[n];
        int[] arry = new int[n];
        int[] arr = new int[n * 2];

        System.arraycopy(nums, 0, arrx, 0, nums.length / 2);
        System.arraycopy(nums, nums.length / 2, arry, 0, nums.length / 2);

        System.out.println(Arrays.toString(arrx));
        System.out.println(Arrays.toString(arry));

        int j = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arrx[j];
                j++;
            } else {
                arr[i] = arry[k];
                k++;
            }
        }

        // fastest method.
        // for (int i = 0; i < n; i++) {
        //     arr[2 * i] = nums[i];
        //     arr[2 * i + 1] = nums[n + i];
        // }

        System.out.println(Arrays.toString(arr));
    }
}
