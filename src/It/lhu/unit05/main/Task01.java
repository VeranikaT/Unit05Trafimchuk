package It.lhu.unit05.main;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        int gsd_ab;
        int lcm_ab;
        gsd_ab = gsd(a, b);
        lcm_ab = lcm(a, b);
        System.out.println("LCM is: " + lcm_ab + " and GCD is: " + gsd_ab + " for numbers " + a + " and " + b + ".");
    }

    public static int gsd(int x, int y) {
        int min;
        int gsd_ab = 0;
        if (x > y) {
            min = y;
        } else {
            min = x;
        }
        for (int i = 1; i <= min; i++) {
            if (x % i == 0 && y % i == 0) {
                gsd_ab = i;
            }
        }
        return gsd_ab;

    }

    public static int lcm(int x, int y) {
        int lcm_ab = (x * y) / gsd(x, y);
        return lcm_ab;
    }
}
