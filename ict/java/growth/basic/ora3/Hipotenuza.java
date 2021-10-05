package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class Hipotenuza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sa eshte katetja A ?");
        double katetaA = input.nextDouble();

        System.out.println("Sa eshte katetja B?");
        double katetaB = input.nextDouble();

        double hipotenuza = Math.sqrt(katetaA*katetaA + katetaB*katetaB);

        System.out.println("Hipotenuza eshte: " + hipotenuza);
    }
}
