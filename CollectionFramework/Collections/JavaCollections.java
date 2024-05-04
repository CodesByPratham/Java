package CollectionFramework.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import CollectionFramework.Set.Student;

public class JavaCollections {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        // Returns the minimum and maximum value of the list.
        System.out.println("Min element" + Collections.min(list));
        System.out.println("Max element" + Collections.max(list));

        // Sorting the list.
        Collections.sort(list);
        System.out.println(list);

        // Reverse sorting the list
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        // Creating ArrayList of custom classes.
        ArrayList<Student> students = new ArrayList<>();

        // Adding data to Arraylist via custom classes.
        students.add(new Student(1, "Pratham"));
        students.add(new Student(5, "Pranjal"));
        students.add(new Student(3, "Saurav"));
        students.add(new Student(2, "Kritika"));
        students.add(new Student(4, "Prem"));

        System.out.println("Students: " + students);

        /*
         * To sort or compare based on roll numbers custom classes we needed to
         * implement Comparable interface in Set/Student.java and we will need to
         * override the compareTo method such that it can return positive, negative or 0
         * to compare elements or here roll numbers.
         */
        Collections.sort(students);
        System.out.println(students);
        Student s1 = new Student(1, "Pratham");
        Student s2 = new Student(2, "Prem");
        System.out.println(s1.compareTo(s2));

        /*
         * Now to dynamically sort or compare based on any type of data we can use
         * Comparator. Using Comparator we will be able to override a function such that
         * we will be able to compare any type of data dynamically, without implementing
         * comparable into the Student class.
         */
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(students);

        /*
         * Now we can perform same functionality using Lambda. It will provide the
         * functionality to compare elements dynamically.
         */
        Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(students);

    }
}