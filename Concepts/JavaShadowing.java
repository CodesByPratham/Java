package Concepts;

public class JavaShadowing {
    static int a = 10;

    public static void main(String[] args) {

        // 10 normal value that was initialized globally.
        System.out.println(a);
        // declaration of new variable that will shadow the variable that was declared
        // globally.
        int a;

        // System.out.println(a); // throws an error cause the new variable is not
        // initialized

        a = 20;
        // 20 prints the variable that was initialized last
        System.out.println(a);

        // int a=30;// throws an error cause of violation of scoping regulations

        random();
    }

    // shadowing can be done in every methods that area declared statically
    static void random() {

        // 10 shadowing hasn't started cause new variable hasn't been declared yet
        System.out.println(a);

        // shadowing starts new variable is declared
        int a = 40;

        // 40 prints the variable that was initialized last
        System.out.println(a);
    }
}