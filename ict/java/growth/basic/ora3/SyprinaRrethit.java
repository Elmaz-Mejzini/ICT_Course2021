package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class SyprinaRrethit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final double Pi  = 3.141592;

        System.out.println("sa eshte rrezja e rrethit?");
        double rrezja = reader.nextDouble();

        double syprina = Pi * rrezja * rrezja;
        System.out.println("Syprina e rrethit eshte" + syprina );


    }
}
