package Concepts;

public class Methods {
    public static void main(String[] args) {

        String greet = "pratham";

        // method call. greet : arguments
        System.out.println(greetings(greet));

        // method overloading example.
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(1, 2.3f));

        // varargs methods example.
        System.out.println("sum of 2, 3, 4 : " + sum(2, 3, 4));
        System.out.println("sum of 2, 3, 4, 5 : " + sum(2, 3, 4, 5));
        System.out.println("sum of 2, 3, 4, 5, 6 : " + sum(2, 3, 4, 5, 6));

    }

    // method declaration/definition.
    public static String greetings(String greet) {

        String hello = "hello";

        // return statement.
        return (hello + " " + greet);
    }

    // method overloading example.
    static int add(int a, int b) {

        return a + b;
    }

    static int add(int a, int b, int c) {

        return a + b + c;
    }

    static float add(int a, float b) {

        return a + b;
    }

    // varargs method.
    public static int sum(int x, int... arr) {

        int result = 0;

        for (int n : arr) {

            result += n;
        }

        return result;
    }
}
