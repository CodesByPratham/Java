package SolvedProblems.Methods;

import java.util.Scanner;

import Tools.Tools;

public class Volume {
    public static Scanner in = new Scanner(System.in);

    static final float pi = 3.14f;

    public static void main(String[] args) {
        Tools.clear();

        String shape;
        do {
            Tools.clear();
            System.out.println("\nVOLUME OF SHAPES");
            System.out.println(
                    "Enter cuboid || cube || cylinder || prism || sphere || pyramid || cone || exit to leave.");
            shape = in.next();

            switch (shape) {
                case "cuboid":
                    cuboid();
                    break;

                case "cube":
                    cube();
                    break;

                case "cylinder":
                    cylinder();
                    break;

                case "prism":
                    prism();
                    break;

                case "sphere":
                    sphere();
                    break;

                case "pyramid":
                    pyramid();
                    break;

                case "cone":
                    cone();
                    break;

                case "exit":
                    break;

                default:
                    System.out.println("Enter a valid shape.");
            }
            Tools.pause();
        } while (!shape.equals("exit"));
    }

    static void cylinder() {
        System.out.println("\nVOLUME OF CYLINDER");
        System.out.print("Enter radius of the circular base :: ");
        float radius = in.nextFloat();
        System.out.print("Enter height of cylinder :: ");
        float height = in.nextFloat();
        System.out.printf("\nVolume of cylinder %.2f", (pi * (radius * radius) * height));
    }

    static void sphere() {
        System.out.println("\nVOLUME OF SPHERE");
        System.out.print("Enter radius of sphere :: ");
        float radius = in.nextFloat();
        System.out.printf("\nVolume of sphere is %.2f", (1.33 * (pi * (radius * radius * radius))));
    }

    static void cone() {
        System.out.println("\nVOLUME OF CONE");
        System.out.print("Enter radius of circular base :: ");
        float radius = in.nextFloat();
        System.out.print("Enter height of cone :: ");
        float height = in.nextFloat();
        System.out.printf("\nVolume of cone is %.2f", (0.33 * pi * (radius * radius) * height));
    }

    static void pyramid() {
        System.out.println("\nVOLUME OF PYRMID");
        System.out.print("Enter area of the base :: ");
        float area_of_base = in.nextFloat();
        System.out.print("Enter height of pyramid :: ");
        float height = in.nextFloat();
        System.out.printf("\nVolume of pyramid is %.2f", ((area_of_base * area_of_base) * (height / 3)));
    }

    private static void prism() {
        System.out.println("\nVOLUME OF PRISM");
        System.out.print("Enter area of base :: ");
        float area_of_base = in.nextFloat();
        System.out.print("Enter height of prism :: ");
        float height = in.nextFloat();
        System.out.printf("\nVolume of prism is %.2f", (area_of_base * height));
    }

    static void cube() {
        System.out.println("\nVOLUME OF CUBE");
        System.out.print("Enter length of side or edge of cube:: ");
        float side = in.nextFloat();
        System.out.printf("\nVolume of cube is %.2f", (side * side * side));
    }

    static void cuboid() {
        System.out.println("\nVOLUME OF CUBOID");
        System.out.print("Enter length of cuboid :: ");
        float length = in.nextFloat();
        System.out.print("Enter the width of cuboid :: ");
        float width = in.nextFloat();
        System.out.print("Enter height of cuboid :: ");
        float height = in.nextFloat();
        System.out.printf("\nVolume of cuboid is %.2f", (length * height * width));
    }
}
