package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class PerimetriRrethit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double Pi = 3.14;
        System.out.println("Sa eshte rrezja e rrethit");
        double rrezja = input.nextDouble();
        double diametri = 2 * rrezja;

        System.out.println("Perimetri i rrethit eshte: " + diametri * Pi);
    }
}
