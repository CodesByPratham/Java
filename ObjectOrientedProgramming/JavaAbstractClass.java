package ObjectOrientedProgramming;

/*
 * Concept of Abstract Class:
 * Class Subject is an abstract class whose abstract methods will be overridden
 * by it's sub class.
 */
abstract class Subject {

    Subject() {
        System.out.println("Learning Subject:");
    }

    // Abstract method syllabus that will be overridden by it's sub class.
    abstract void syllabus();

    void Learn() {
        System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {

    @Override
    void syllabus() {
        System.out.println("C, Java, C++");
    }
}

public class JavaAbstractClass {

    public static void main(String[] args) {

        Subject x = new IT();

        x.syllabus();
        x.Learn();
    }
}

// Refer the GFG for detailed explanation:
// https:// www.geeksforgeeks.org/classes-objects-java/