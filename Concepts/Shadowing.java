package Concepts;

public class Shadowing {
    static int a = 10;

    public static void main(String[] args) {

        System.out.println(a);// 10 normal value that was initialized globally.
        int a;// declaration of new variable that will shadow the variable that was declared globally.

        // System.out.println(a); // throws an error cause the new variable is not initialized
        a = 20;
        System.out.println(a);// 20 prints the variable that was initialized last
        {
            // int a=30;// throws an error cause of violation of scoping regulations
        }

        random();
    }

    static void random() {// shadowing can be done in every methods that area declared statically

        System.out.println(a);// 10 shadowing hasn't started cause new variable hasn't been declared yet

        int a = 40;// shadowing starts new variable is declared
        
        System.out.println(a);// 40 prints the variable that was initialized last
    }
}