import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };

        increment(a);

        System.out.println(Arrays.toString(a));
    }

    private static void increment(int[] a) {
        a[2] = 99;
        // System.out.println(a);
    }
}