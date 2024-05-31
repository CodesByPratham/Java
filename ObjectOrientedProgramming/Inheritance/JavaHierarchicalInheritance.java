package ObjectOrientedProgramming.Inheritance;

/* 
 * Concept of hierarchical inheritance:
 * When more than one classes inherit a same class then this is called hierarchical inheritance.
 */

// Parent or super class A that is inherited by many other classes.
class A {

    public void printA() {

        System.out.println("Class A");
    }
}

// Sub class B that inherits the class A.
class B extends A {

    public void printB() {

        System.out.println("Class B");
    }
}

// Sub class C that inherits the class A.
class C extends A {

    public void printC() {

        System.out.println("Class C");
    }
}

// Sub class D that inherits the class A.
class D extends A {

    public void printD() {

        System.out.println("Class D");
    }
}

public class JavaHierarchicalInheritance {

    public static void main(String[] args) {

        B objB = new B();
        objB.printA();
        objB.printB();

        C objC = new C();
        objC.printA();
        objC.printC();

        D objD = new D();
        objD.printA();
        objD.printD();
    }
}
