package ObjectOrientedProgramming;

// Base or Super Class whose features are inherited.
class Employee {

    // Data member of class Employee.
    int salary = 60000;

    // Method of class Employee
    public void printSalary() {
        System.out.println("Salary: " + this.salary);
    }
}

/*
 * Derived or Sub Class that inherits the features of class Employee using
 * extends keyword.
 */
class Engineer extends Employee {

    // Data member of class Engineer.
    int benefits = 10000;

    // Method of class Engineer
    public void printBenefits() {
        System.out.println("Benefits: " + this.benefits);
    }

    /*
     * Method of class Engineer that prints benefits and salary that is inherited
     * from class Employee.
     */
    public void printData() {
        System.out.println("Salary: " + this.salary + "Benefits: " + this.benefits);
    }
}

public class JavaInheritance {

    public static void main(String[] args) {

        Engineer e1 = new Engineer();
        System.out.println("Salary: " + e1.salary + "\nBenefits: " + e1.benefits);
    }
}
