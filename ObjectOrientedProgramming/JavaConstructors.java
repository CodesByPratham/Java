package ObjectOrientedProgramming;

// User defined class Student.
class Student {

    /*
     * A constructor in Java is a special method that is used to initialize objects.
     * The constructor is called when an object of a class is created. It can be
     * used to set initial values for object attributes. In Java, if you don’t
     * define a constructor for a class, the Java compiler automatically provide and
     * call a default constructor. There are three types of constructors. This is
     * default constructor.
     */
    Student() {
        System.out.println("This is default constructor.");
    }

    // Parameterized constructor used to initialize the data members.
    Student(int rollNo, int age, int percentage, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    // Copy constructor that takes an object as a parameter.
    Student(Student stu) {
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

public class JavaConstructors {

    public static void main(String[] args) {

        // Creation of an object that calls default constructor.
        Student s1 = new Student();
        s1.rollNo = 99;
        s1.name = "Pratham";
        s1.age = 20;
        s1.percentage = 81;
        s1.printInfo();

        // Creation of an object that calls parameterized constructor.
        Student s2 = new Student(11, 20, 89, "Kritika");
        s2.printInfo();

        // Creation of an object that calls the copy constructor.
        Student s3 = new Student(s1);
        s3.printInfo();
    }
}
