package SolvedProblems.Conditional_Loops;

import java.util.Scanner;
import Tools.Tools;

public class Volume {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        final float pi = 3.14f;
        float length, width, height, side, radius, area_of_base;
        String shape;
        do {
            Tools.clear();
            System.out.println("\nVOLUME OF SHAPES");
            System.out.println(
                    "Enter cuboid || cube || cylinder || prism || sphere || pyramid || cone || exit to leave.");
            shape = in.next();

            switch (shape) {
                case "cuboid":
                    System.out.println("\nVOLUME OF CUBOID");
                    System.out.print("Enter length of cuboid :: ");
                    length = in.nextFloat();
                    System.out.print("Enter the width of cuboid :: ");
                    width = in.nextFloat();
                    System.out.print("Enter height of cuboid :: ");
                    height = in.nextFloat();
                    System.out.printf("\nVolume of cuboid is %.2f", (length * height * width));
                    break;

                case "cube":
                    System.out.println("\nVOLUME OF CUBE");
                    System.out.print("Enter length of side or edge of cube:: ");
                    side = in.nextFloat();
                    System.out.printf("\nVolume of cube is %.2f", (side * side * side));
                    break;

                case "cylinder":
                    System.out.println("\nVOLUME OF CYLINDER");
                    System.out.print("Enter radius of the circular base :: ");
                    radius = in.nextFloat();
                    System.out.print("Enter height of cylinder :: ");
                    height = in.nextFloat();
                    System.out.printf("\nVolume of cylinder %.2f", (pi * (radius * radius) * height));
                    break;

                case "prism":
                    System.out.println("\nVOLUME OF PRISM");
                    System.out.print("Enter area of base :: ");
                    area_of_base = in.nextFloat();
                    System.out.print("Enter height of prism :: ");
                    height = in.nextFloat();
                    System.out.printf("\nVolume of prism is %.2f", (area_of_base * height));
                    break;

                case "sphere":
                    System.out.println("\nVOLUME OF SPHERE");
                    System.out.print("Enter radius of sphere :: ");
                    radius = in.nextFloat();
                    System.out.printf("\nVolume of sphere is %.2f", (1.33 * (pi * (radius * radius * radius))));
                    break;

                case "pyramid":
                    System.out.println("\nVOLUME OF PYRMID");
                    System.out.print("Enter area of the base :: ");
                    area_of_base = in.nextFloat();
                    System.out.print("Enter height of pyramid :: ");
                    height = in.nextFloat();
                    System.out.printf("\nVolume of pyramid is %.2f", ((area_of_base * area_of_base) * (height / 3)));
                    break;

                case "cone":
                    System.out.println("\nVOLUME OF CONE");
                    System.out.print("Enter radius of circular base :: ");
                    radius = in.nextFloat();
                    System.out.print("Enter height of cone :: ");
                    height = in.nextFloat();
                    System.out.printf("\nVolume of cone is %.2f", (0.33 * pi * (radius * radius) * height));
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("Enter a valid shape.");
            }
            Tools.pause();
        } while (shape.equals("cuboid") || shape.equals("cube") || shape.equals("cylinder") || shape.equals("prism")
                || shape.equals("sphere") || shape.equals("pyramid") || shape.equals("cone"));
    }
}
