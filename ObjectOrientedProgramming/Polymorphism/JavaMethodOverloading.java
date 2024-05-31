package ObjectOrientedProgramming.Polymorphism;

class Sum {

    // Method Overloaded. This sum takes two int parameters
    public int sum(int x, int y) {

        return (x + y);
    }

    // Method Overloaded. This sum takes three int parameters
    public int sum(int x, int y, int z) {
        
        return (x + y + z);
    }

    // Method Overloaded. This sum takes two double parameters
    public double sum(double x, double y) {

        return (x + y);
    }
}

public class JavaMethodOverloading {

    public static void main(String[] args) {

        // Creation of an object of class Sum.
        Sum s = new Sum();

        // Overloading the method by passing different parameters.
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
