package SolvedProblems.Conditional_Loops;

import java.util.Scanner; 
import Tools.Tools;

public class Fibonnaci {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                             

        int a = 0, b = 1;

        int n = in.nextInt();

        // 0,1,1,2,3,5,8,13,21,34,55,89,144

        for (int i = 2; i < n; i++) {
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println(b);
    }
}
