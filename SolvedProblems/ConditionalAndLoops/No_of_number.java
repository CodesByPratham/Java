package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner; 
import Tools.Tools;

public class No_of_number {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                             

        System.out.print("Enter an integer ::");
        int n = in.nextInt();
        System.out.print("Enter the num you want number of :: ");
        int x = in.nextInt();
        int count = 0;

        while (n > 0) {
            if (n % 10 == x) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
