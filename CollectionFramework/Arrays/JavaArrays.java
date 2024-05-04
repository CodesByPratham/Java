package CollectionFramework.Arrays;

import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {

        // Initialize the Array.
        int[] arr = { 2, 4, 1, 5, 7, 9, 4, 6, 7, 2, 8, 1 };

        // Sorts the array.
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // Find the index of the element using binary search tree.
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("\nThe element 1 is present at index: " + index);

        // Returns the hash code of the array.
        System.out.println(Arrays.hashCode(arr));
    }
}
