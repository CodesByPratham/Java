package ObjectOrientedProgramming.Inheritance;

/*
 * Concept of hybrid inheritance:
 * In Java, the hybrid inheritance is the composition of two or more types of
 * inheritance. The main purpose of using hybrid inheritance is to modularize
 * the code into well-defined classes. It also provides the code reusability.
 * The hybrid inheritance can be achieved by combining various different types
 * of inheritance. Following is the combination of single level inheritance 
 * and hierarchical inheritance.
 */

// Parent class GrandFather whose properties are inherited by other classes.
class GrandFather {

    public void printGrandFather() {

        System.out.println("He is grandfather.");
    }
}

// Class Father that inherits GrandFather properties
class Father extends GrandFather {

    public void printFather() {

        System.out.println("He is father.");
    }
}

// Class Son that inherits Father properties
class Son extends Father {

    public void printSon() {

        System.out.println("He is son.");
    }
}

// Class Daughter that inherits Father properties
class Daughter extends Father {

    public void printDaughter() {

        System.out.println("She is daughter.");
    }
}

public class JavaHybridInheritance {

    public static void main(String[] args) {

        Son obj = new Son();
        obj.printSon();
        obj.printFather();
        obj.printGrandFather();
        Daughter obj2 = new Daughter();
        obj2.printDaughter();
        obj2.printFather();
        obj2.printGrandFather();
    }
}
