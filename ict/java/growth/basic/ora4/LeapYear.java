package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Is given year A leap year? po nese pjestohet me 400, ose pjestohet me 4 por jo 100;
        Scanner input = new Scanner(System.in);
        int year;


        System.out.println("\n Sheno nje vite qe mendon: ");
        year = input.nextInt();

        if ( year % 400 == 0) {
            System.out.printf("\n %d is a Leap Year. \n", year);
        }
        else if (year%100 == 0) {
            System.out.printf("\n %d is NOT a Leap Year. \n", year);
        }
        else if(year%4 == 0) {
            System.out.printf("\n %d is a Leap Year. \n", year);
        }
        else {
            System.out.printf("\n %d is NOT a Leap Year. \n", year);
        }
    }
}
