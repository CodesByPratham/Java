package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adds or puts elements into the HashMap.
        students.put(1, "Pratham");
        students.put(2, "Kritika");
        students.put(3, "Saurav");
        students.put(4, "Prem");
        students.put(5, "Pranjal");
        System.out.println(students);

        // Overrides the value if given key already exists.
        students.put(5, "Mitul");
        System.out.println(students);

        // For each loop to iterate over the HashMap.
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Roll No: " + student.getKey() + " | Name: " + student.getValue());
        }

        // Checks if the given key or value is present in the HashMap or not.
        System.out.println(students.containsKey(2));
        System.out.println(students.containsValue("student"));

        // Removes the element of the given key.
        System.out.println(students.remove(4));
        System.out.println(students);

        // Checks if the HashMap is empty or not.
        System.out.println(students.isEmpty());

        // Gets the value of the given key.
        System.out.println(students.get(2));
        System.out.println(students.get(8));

        // Refer the GFG for detailed explanation:
        // https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
    }
}
