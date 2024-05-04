package SolvedProblems.Arrays;

import java.util.Arrays;

import Tools.Tools;

public class Running_sum_of_1dArray {

    public static void main(String[] args) {
        Tools.clear();

        int[] nums = { 1, 2, 3, 4 };

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
