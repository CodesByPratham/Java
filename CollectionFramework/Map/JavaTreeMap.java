package CollectionFramework.Map;

import java.util.TreeMap;
import java.util.Map;

public class JavaTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // Adds or puts elements into the TreeMap.
        students.put(1, "Pratham");
        students.put(2, "Kritika");
        students.put(3, "Saurav");
        students.put(4, "Prem");
        students.put(5, "Pranjal");
        System.out.println(students);

        // Overrides the value if given key already exists.
        students.put(5, "Mitul");
        System.out.println(students);

        // For each loop to iterate over the TreeMap.
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            
            System.out.println("Roll No: " + student.getKey() + " | Name: " + student.getValue());
        }

        // Checks if the given key or value is present in the TreeMap or not.
        System.out.println(students.containsKey(2));
        System.out.println(students.containsValue("student"));

        // Removes the element of the given key.
        System.out.println(students.remove(4));
        System.out.println(students);

        // Checks if the TreeMap is empty or not.
        System.out.println(students.isEmpty());

        // Gets the value of the given key.
        System.out.println(students.get(2));
        System.out.println(students.get(8));
    }
}
