package CollectionFramework.Set;

import java.util.TreeSet;

public class JavaTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Adds element into TreeSet.
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

        // Removes element from the TreeSet.
        set.remove(21);
        set.remove(32);
        System.out.println(set);

        // Checks if the given value is present in the TreeSet or not.
        System.out.println(set.contains(54));

        // Checks if the TreeSet is empty or not.
        System.out.println(set.isEmpty());

        // Returns the size of the TreeSet.
        System.out.println(set.size());

        // Clears the TreeSet.
        set.clear();
        System.out.println(set);

        // Refer the GFG for detailed explanation:
        // https://www.geeksforgeeks.org/treeset-in-java-with-examples/
    }
}
