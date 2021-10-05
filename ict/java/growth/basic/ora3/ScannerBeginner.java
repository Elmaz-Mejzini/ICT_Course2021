package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class ScannerBeginner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Username");

        String userName = myObj.nextLine();

        System.out.println("Your Name is: " + userName);
    }
}
