package Concepts;

import java.util.Scanner;
import Tools.Tools;

public class TypeCasting {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        float n = in.nextFloat();
        int num = (int) (n);

        System.out.println(num);

    }
}
