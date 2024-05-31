package ObjectOrientedProgramming.Inheritance;

/* 
 * Concept of multilevel inheritance:
 * When a class extends a class, which extends anther class then this is called multilevel inheritance.
 */

// First level that is the parent class Vehicle.
class Vehicle {

    void type() {

        System.out.println("Type: Car");
    }
}

// Second level, here the class Maruti inherits the features of class Car.
class Maruti extends Vehicle {

    void brand() {

        System.out.println("Brand: Maruti");
    }
}

// Third level, here the class Maruti800 inherits the features of class Maruti
// and Car.
class Maruti800 extends Maruti {

    void speed() {

        System.out.println("Speed: 80Kmph");
    }
}

public class JavaMultilevelInheritance {
    
    public static void main(String[] args) {

        Maruti800 m = new Maruti800();
        m.type();
        m.brand();
        m.speed();
    }
}
