package SolvedProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Targeted_array {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0 };
        int[] index = { 0, 1, 0 };
        // int[] target = new int[nums.length];
        // for (int i = 0; i < index.length; i++) {
        // if (target[index[i]] != 0) {
        // for (int j = nums.length - 1; j > index[i]; j--) {
        // target[j] = target[j - 1];
        // }

        // }
        // target[index[i]] = nums[i];
        // }
        // System.out.println(Arrays.toString(target));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
