package CollectionFramework.Set;

import java.util.HashSet;

public class JavaHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Adds element into HashSet.
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);

        // We cannot add same elements, it allows only unique elements.
        set.add(54);
        set.add(54);
        set.add(54);
        System.out.println(set);

        // Removes element from the HashSet.
        set.remove(21);
        set.remove(32);
        System.out.println(set);

        // Checks if the given value is present in the HashSet or not.
        System.out.println(set.contains(54));

        // Checks if the HashSet is empty or not.
        System.out.println(set.isEmpty());

        // Returns the size of the HashSet.
        System.out.println(set.size());

        // Clears the HashSet.
        set.clear();
        System.out.println(set);

        // Refer the GFG for detailed explanation:
        // https://www.geeksforgeeks.org/hashset-in-java/
    }
}
