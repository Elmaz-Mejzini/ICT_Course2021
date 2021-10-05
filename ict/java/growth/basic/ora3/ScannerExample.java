package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Shkruaj emrin, moshen dhe rrogen:");

        String firstName = myObj.nextLine();
        int moshaM = myObj.nextInt();
        double rrogaM = myObj.nextDouble();

        System.out.println("Emri juaj eshte:" + firstName);
        System.out.println("Mosha juaj eshte:" + moshaM);
        System.out.println("Rooga juaj eshte:" + rrogaM);
    }
}
