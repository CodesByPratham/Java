package Generics;

public class JavaGenericExample {
    // Generic method to swap two values
    @SuppressWarnings("unchecked")
    public static <T1, T2> void swapValues(Pair<T1, T2> pair) {
        T1 first = pair.getFirst();
        T2 second = pair.getSecond();
        System.out.println("Before Swap:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        // Swap logic
        pair.setFirst((T1) second);
        pair.setSecond((T2) first);

        System.out.println("After Swap:");
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }

    public static void main(String[] args) {
        // Create a pair with different types
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        swapValues(pair);
    }
}

class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }
}
