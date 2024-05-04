package SolvedProblems.Arrays;

public class No_of_good_pairs {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 3 };

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}