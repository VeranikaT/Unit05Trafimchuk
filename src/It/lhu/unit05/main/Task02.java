package It.lhu.unit05.main;

import java.util.Random;

public class Task02 {

    public static void main(String[] args) {
        int[] array = new int[3];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        System.out.print("The original array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%3d] ", array[i]);
        }
        int small = min(array);
        int big = max(array);
        System.out.println("\nThe smallest number in array is: " + small + ".");
        System.out.println("The biggest number in array is: " + big + ".");
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}