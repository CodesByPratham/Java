package ObjectOrientedProgramming.Inheritance;

/*
 * Concept of Single Inheritance:
 * Certainly! Let’s dive into the concept of single inheritance in Java.
 * Inheritance is a fundamental concept in object-oriented programming (OOP)
 * that allows one class to inherit properties and behaviors from another class.
 * In the case of single inheritance, a subclass can inherit from only one
 * superclass. This promotes clean and maintainable code by simplifying class
 * hierarchies.
 */

// Base or Super Class whose features are inherited.
class Profession {
    // Data member of class Profession.
    float salary = 40000;
}

/*
 * Derived or Sub Class that inherits the features of class Profession using
 * extends keyword.
 */
class Programmer extends Profession {
    // Data member of class Programmer.
    int bonus = 10000;

}

public class JavaSingleInheritance {

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}