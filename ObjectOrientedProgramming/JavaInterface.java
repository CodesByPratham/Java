package ObjectOrientedProgramming;

// Interface Vehicles that will be implemented by various classes.
interface Vehicles {

    // A class that implements this interface must implement all the methods.
    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);
}

class Bicycle implements Vehicles {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicles {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

public class JavaInterface {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}
