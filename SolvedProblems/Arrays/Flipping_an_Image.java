package SolvedProblems.Arrays;

import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        for (int j = 0; j < image.length; j++) {
            for (int i = 0; i < image[j].length; i++) {
                if (image[j][i] == 0) {
                    image[j][i] = 1;
                } else {
                    image[j][i] = 0;
                }
            }
            for (int i = 0; i < image[j].length / 2; i++) {
                int temp = image[j][i];
                image[j][i] = image[j][image[i].length - i - 1];
                image[j][image[i].length - i - 1] = temp;
            }
        }

        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println("");

        // for (int j = 0; j < image.length; j++) {
        // for (int i = 0; i < image[j].length; i++) {
        // if (image[j][i] == 0) {
        // image[j][i] = 1;
        // } else {
        // image[j][i] = 0;
        // }
        // }
        // }

        // for (int i = 0; i < image.length; i++) {
        //     System.out.println(Arrays.toString(image[i]));
        // }

        // int [][] copy =
        // Arrays.stream(image).map(int[]::clone).toArray(int[][]::new);

    }
}