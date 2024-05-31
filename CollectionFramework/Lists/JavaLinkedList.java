package CollectionFramework.Lists;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        // Adds element at the end of the LinkedList.
        nums.add(4);
        System.out.println(nums);

        // Adds element at 2nd index of the LinkedList.
        nums.add(2, 99);
        System.out.println(nums);

        LinkedList<Integer> numsB = new LinkedList<>();
        nums.add(11);
        nums.add(22);
        nums.add(33);

        // Appends all the elements of the LinkedList numsB.
        nums.addAll(numsB);
        System.out.println(nums);

        // Gets the element of the given index.
        System.out.println(nums.get(2));

        // Updates the element of the given index.
        nums.set(1, 77);
        System.out.println(nums);

        // Returns a boolean value if the element present in the LinkedList.
        System.out.println(nums.contains(4));

        // Removes the element of given index.
        nums.remove(2);
        System.out.println(nums);

        // Removes the given element.
        nums.remove(Integer.valueOf(11));
        System.out.println(nums);

        // Iterates over the elements of the LinkedList.
        for (int i = 0; i < nums.size(); i++) {
            System.out.println("Number at index " + i + ": " + nums.get(i));
        }

        // Iterates over the LinkedList
        for (Integer element : nums) {
            System.out.println("foreach element is: " + element);
        }

        // An iterator is an object used to iterate over the elements in a collection.
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // Clears the LinkedList.
        nums.clear();
        System.out.println(nums);
    }
}
