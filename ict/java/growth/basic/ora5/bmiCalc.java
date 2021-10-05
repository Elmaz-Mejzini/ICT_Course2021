package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class bmiCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Shenoje peshen ne kg:");
        float weight = input.nextFloat();
        System.out.print("Shenoje gjatesin ne cm: ");
        float height = input.nextFloat();

        // multiplication by 100*100 for cm to m conversion
        float bmi = (100 * 100 * weight) / (height * height);

        System.out.println(" BMI juaj eshte: " + bmi);
         printBMICategory(bmi);

    }


    public static void printBMICategory(float bmi) {
        if (bmi < 18.5) {
            System.out.println("Je nen peshe");
        } else if (bmi < 25) {
            System.out.println("Je normal");
        } else if (bmi < 30) {
            System.out.println("Je mbi peshe");
        } else {
            System.out.println("Je obez");
        }
    }
}