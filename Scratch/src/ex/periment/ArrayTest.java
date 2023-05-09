package ex.periment;

import java.util.Arrays;

class ArrayTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 37;
        ages[1] = 9;
        ages[2] = 35;
        ages[3] = 5;
        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));
        double[] temps = {64.0, 75.3, 83.3, 49.0, 55.6};
        for(double temp : temps) {
            System.out.println("The temperature is: " + temp);
        }
        System.out.println();
        for(int i = 0; i < temps.length; i++) {
            System.out.println("The Temperature is: " + temps[i]);
        }
    }
}