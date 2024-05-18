package ObjectOrientedProgramming.ClassesAndObjects;

// User defined class Students.
class Students {

    // Default Constructor.
    Students() {
        System.out.println("This is default constructor.");
    }

    /*
     * Concept of Constructor Overloading:-
     * Constructor overloading in Java allows a class to have multiple constructors,
     * each with a different set of parameters, in such a way so that each
     * constructor performs a different task. These constructors can be called based
     * on the arguments provided when creating a new object.
     */
    
    // Parameterized constructor used to initialize the data members.
    Students(int rollNo, int age, int percentage, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    // Copy constructor that takes an object as a parameter.
    Students(Students stu) {
        this.rollNo = stu.rollNo;
        this.name = stu.name;
        this.age = stu.age;
        this.percentage = stu.percentage;
    }

    // Data members.
    int rollNo, age, percentage;
    String name;

    // Method to print info of student.
    public void printInfo() {
        System.out.println("\nRoll No.: " + this.rollNo + "\nName: " + this.name + "\nAge: " + this.age
                + "\nPercentage: " + this.percentage);
    }
}

public class JavaConstructorOverloading {

    public static void main(String[] args) {

        // Creation of an object that calls default constructor.
        Students s1 = new Students();
        s1.rollNo = 99;
        s1.name = "Pratham";
        s1.age = 20;
        s1.percentage = 81;
        s1.printInfo();

        // Creation of an object that calls parameterized constructor.
        Students s2 = new Students(11, 20, 89, "Kritika");
        s2.printInfo();

        // Creation of an object that calls the copy constructor.
        Students s3 = new Students(s1);
        s3.printInfo();
    }
}