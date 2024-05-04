package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class JavaLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Adds element into LinkedHashSet.
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

        // Removes element from the LinkedHashSet.
        set.remove(21);
        set.remove(32);
        System.out.println(set);

        // Checks if the given value is present in the LinkedHashSet or not.
        System.out.println(set.contains(54));

        // Checks if the LinkedHashSet is empty or not.
        System.out.println(set.isEmpty());

        // Returns the size of the LinkedHashSet.
        System.out.println(set.size());

        // Clears the LinkedHashSet.
        set.clear();
        System.out.println(set);

        // Refer the GFG for detailed explanation:
        // https://www.geeksforgeeks.org/linkedhashset-in-java-with-examples/
    }
}
