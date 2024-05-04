package SolvedProblems.Arrays;

import java.util.Arrays;

import Tools.Tools;

public class Build_array_from_purmutation {

    public static void main(String[] args) {
        Tools.clear();

        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(nums));
        int[] arr= new int[nums.length];

        for(int i=0;i<nums.length;i++){

            arr[i] = nums[nums[i]];
        }
        
        System.out.println(Arrays.toString(arr));
        }
}
