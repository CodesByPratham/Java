package CollectionFramework.Set;

import java.util.HashSet;

public class StudentSet {

    public static void main(String[] args) {

        HashSet<Student> studentSet = new HashSet<>();

        /*
         * HashSet in the StudentSet class will not allow adding Student objects with
         * the same rollNo, regardless of their name. The HashSet will use the
         * overridden hashCode() to determine the bucket for each Student and equals()
         * to check for actual equality in cases of hash collisions or within the same
         * bucket.
         */
        studentSet.add(new Student(1, "Pratham"));
        studentSet.add(new Student(2, "Kritika"));
        studentSet.add(new Student(3, "Saurav"));
        studentSet.add(new Student(4, "Prem"));
        studentSet.add(new Student(1, "Pratham"));
        studentSet.add(new Student(6, "Pranjal"));


        Student s1 = new Student(1, "Pratham");
        Student s2 = new Student(1, "Kritika");
        
        System.out.println(s1.equals(s2));

        System.out.println(studentSet);
    }
}
