package SolvedProblems.Arrays;

public class Find_the_highest_altitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };

        int sum = 0;
        int max = 0;       

        for (int i : gain) {
            sum += i; 
            max = Math.max(max, sum);
        }
        System.out.println(sum);
        System.out.println(max);
    }
}