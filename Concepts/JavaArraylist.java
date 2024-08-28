package Concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // print the list.
        System.out.println(list);

        // inputs.
        for (int i = 0; i < 5; i++) {

            list.add(in.nextInt());
        }

        // outputs.
        for (int i = 0; i < 5; i++) {

            System.out.println(list.get(i));
        }

        System.out.println(list);

        // check for the values.
        System.out.println(list.contains(5));
        System.out.println(list.contains(9));

        // edit the list elements.
        list.set(0, 99);
        System.out.println(list);

        // remove an element.
        list.remove(3);
        System.out.println(list);

        // two dimensional arraylist.
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        // initialization of arraylist.
        for (int i = 0; i < 3; i++) {

            list2.add(new ArrayList<>());
        }

        // add elements.
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                list2.get(i).add(in.nextInt());
            }
        }
        // print elements.
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(list2.get(i).get(j) + " ");
            }

            System.out.println();
        }

        System.out.println(list2);
    }
}
