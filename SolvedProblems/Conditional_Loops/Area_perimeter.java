package SolvedProblems.Conditional_Loops;

import java.util.Scanner;

import Tools.Tools;

public class Area_perimeter {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tools.clear();

        float radius, side, height, width, side1, side2, side3;
        String type;

        do {
            Tools.clear();
            System.out.println("CALCULATION OF AREA AND PERIMETER ");
            System.out.printf(
                    "\nEnter 'area' for calculating area. \nEnter 'perimeter' for calculating perimeter. \nEnter 'exit' to leave. ");
            System.out.print("\nEnter your choice ::");
            type = in.next();

            switch (type) {
                case "area": {

                    System.out.println("\nAREA OF SHAPES");
                    System.out.printf("Enter 'circle' || 'square' || 'rectangle' || 'triangle'");
                    System.out.println("Enter the shape :: ");
                    String shape = in.next();

                    switch (shape) {
                        case "circle":
                            System.out.print("Enter radius :: ");
                            radius = in.nextFloat();
                            System.out.printf("Area of circle = %.2f ", (3.14 * radius));
                            break;
                        case "square":
                            System.out.print("Enter side :: ");
                            side = in.nextFloat();
                            System.out.printf("Area of square = %.2f ", (side * side));
                            break;
                        case "rectangle":
                            System.out.print("Enter height :: ");
                            height = in.nextFloat();
                            System.out.print("Enter width :: ");
                            width = in.nextFloat();
                            System.out.printf("Area of rectangle = %.2f ", (height * width));
                            break;
                        case "tringle":
                            System.out.print("Enter height :: ");
                            height = in.nextFloat();
                            System.out.print("Enter width :: ");
                            width = in.nextFloat();
                            System.out.printf("Area of triangle = %.2f ", (0.5 * (height * width)));
                            break;
                        default:
                            System.out.println("Enter a valid shape.");
                    }
                    Tools.pause();
                    break;
                }
                case "perimeter": {

                    System.out.println("\nPERIMETER OF SHAPES");
                    System.out.printf("Enter 'circle' || 'square' || 'rectangle' || 'triangle'");
                    System.out.print("Enter the shape :: ");
                    String shape = in.next();

                    switch (shape) {
                        case "circle":
                            System.out.print("Enter radius :: ");
                            radius = in.nextFloat();
                            System.out.printf("Perimeter of circle = %.2f ", (2 * 3.14 * radius));
                            break;
                        case "square":
                            System.out.print("Enter side :: ");
                            side = in.nextFloat();
                            System.out.printf("Perimeter of square = %.2f ", (4 * side));
                            break;
                        case "rectangle":
                            System.out.print("Enter height :: ");
                            height = in.nextFloat();
                            System.out.print("Enter width :: ");
                            width = in.nextFloat();
                            System.out.printf("Perimeter of rectangle = %.2f ", (2 * (height + width)));
                            break;
                        case "tringle":
                            System.out.print("Enter first side :: ");
                            side1 = in.nextFloat();
                            System.out.print("Enter second side :: ");
                            side2 = in.nextFloat();
                            System.out.print("Enter third side :: ");
                            side3 = in.nextFloat();
                            System.out.printf("Perimeter of triangle = %.2f ", (side1 + side2 + side3));
                            break;
                        default:
                            System.out.println("Enter a valid shape.");
                    }
                    Tools.pause();
                    break;
                }
                case "exit": {
                    break;
                }
                default: {
                    System.out.println("Enter either area or perimeter.");
                    Tools.pause();
                }
            }
        } while (!type.equals("exit"));
    }
}