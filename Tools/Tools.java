package Tools;

import java.util.Scanner; 

public class Tools {
    
    public static Scanner in = new Scanner(System.in);

    /**
     * This method pauses the the output of program in till the user presses enter key.
     */
    public static void pause() {
        in.nextLine();
    }

     /*
      * The method clears the terminal but the program keeps running.
      */
    public static void clear(){
        System.out.println("\033[H\033[2J");
    }
}
