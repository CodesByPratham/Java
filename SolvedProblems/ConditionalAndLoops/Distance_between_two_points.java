package SolvedProblems.ConditionalAndLoops;

import java.util.Scanner; 
import Tools.Tools;

public class Distance_between_two_points {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();                                                                                                                             
        int x1, x2, y1, y2;
        System.out.println("Enter the values :-");
        System.out.print("A(X1,Y1) :: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.print("B(X2,Y2) :: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        float distance = (float) (Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
        System.out.println("");
        System.out.print(
                "Distance between " + "A(" + x1 + "," + y1 + ")" + " and " + "B(" + x2 + "," + y2 + ") = ");
        System.out.printf("%.2f", distance);
        
    }
}
