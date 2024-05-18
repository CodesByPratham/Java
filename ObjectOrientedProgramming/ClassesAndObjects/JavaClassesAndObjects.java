package ObjectOrientedProgramming.ClassesAndObjects;

// User defined class Car.
class Car {

    // Data members(instance variables) of the class.
    public String company, engine;
    public int cylinders;

    // Method of the class to print data.
    public void printData() {
        // The this keyword refers to the current object in a method or constructor.
        System.out
                .println("\nCompany: " + this.company + "\nEngine: " + this.engine + "\nCylinders: " + this.cylinders);
    }
}

public class JavaClassesAndObjects {

    public static void main(String[] args) {

        /*
         * Object(instance of the class) of the class Car. Objects of custom classes are
         * allocated memory in the heap when created using the new keyword. Memory is
         * allocated based on the class’s structure.
         */
        Car verna = new Car();

        // Initializing the data members using object.
        verna.company = "Hyundai";
        verna.engine = "Petrol";
        verna.cylinders = 4;

        // Calling the method of the class using object.
        verna.printData();

        // Creating another object of the class Car.
        Car Harrier = new Car();

        Harrier.company = "Hyundai";
        Harrier.engine = "Petrol";
        Harrier.cylinders = 4;

        Harrier.printData();

    }
}
