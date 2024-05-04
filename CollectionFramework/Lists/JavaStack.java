package CollectionFramework.Lists;

import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        // Pushes or inserts the element in the stack.
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Fox");
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Elephant");

        // Prints the Stack.
        System.out.println(animals);

        // Returns the topmost elements of the stack.
        System.out.println(animals.peek());

        // Pops or removes the topmost element.
        animals.pop();
        System.out.println(animals.peek());

        // Refer the GFG for detailed explanation:
        // https://www.geeksforgeeks.org/stack-class-in-java/

    }
}
