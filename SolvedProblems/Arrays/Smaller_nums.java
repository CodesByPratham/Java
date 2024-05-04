package SolvedProblems.Arrays;

import java.util.Arrays;

public class Smaller_nums {

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        // int[] arr = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] > nums[j])
        // count++;
        // }
        // arr[i] = count;
        // }

        // System.out.println(Arrays.toString(arr));

        int[] bucket = new int[101];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]] += 1;
        }
        for (int i = 1; i < 101; i++) {
            bucket[i] += bucket[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int pos = nums[i];
            if (pos == 0) {
                nums[i] = 0;
            } else {
                nums[i] = bucket[pos - 1];
            }
        }
        // return nums;
        System.out.println(Arrays.toString(nums));
    }
}
