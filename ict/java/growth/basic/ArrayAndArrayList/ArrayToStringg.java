package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.ArrayAndArrayList;

import java.util.Arrays;

public class ArrayToStringg {
    public static void main(String[] args) {
        int[] array1 = {
                189, 123, 666, 22, 13, 44, 55, 1
        };
        String[] array2 = {
                "Elmaz",
                "Charles",
                "Muhammed",
                "Histori"
        };

        System.out.println("Shfaq vargun e numrave siq eshte" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Shfaq vargun e sortuar" + Arrays.toString(array1));


        System.out.println("Shfaq stringun siq eshte" + Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println("Shfaq stringun e sortuar" + Arrays.toString(array2));
    }
}
