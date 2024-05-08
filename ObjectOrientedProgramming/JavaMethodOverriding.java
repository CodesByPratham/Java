package ObjectOrientedProgramming;

// Super class Parent whose method is overridden by the sub class Child.
class Parent {

    void show() {
        System.out.println("Parent class method");
    }
}

// Sub class Child that will override the method of Super class Parent.
class Child extends Parent {

    /*
     * Concept of Method Overriding:
     * The method show() has the same name, same return type and same parameters as
     * the method in parent class so, it can be said that the Child class overrides
     * the method show() of parent class.
     */
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class JavaMethodOverriding {

    public static void main(String[] args) {

        /*
         * If an object of a parent class is used to invoke the method, then the version
         * in the parent class will be executed, but if an object of the subclass is
         * used to invoke the method, then the version in the child class will be
         * executed. In other words, it is the type of the object being referred to (not
         * the type of the reference variable) that determines which version of an
         * overridden method will be executed.
         */

        Parent obj1 = new Parent();
        obj1.show();

        Parent obj2 = new Child();
        obj2.show();
    }
}