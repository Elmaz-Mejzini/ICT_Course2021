package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class Syprinatrekendshit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Syprina e trekendshit kenddrejt
        System.out.println("Sa brinje te njejta ka trekendshi kendrejt?");
        int numriBrinjeve = input.nextInt();

        System.out.println("Sa eshte gjatesia e brinjes A?");
        double gjatesiaA = input.nextDouble();

        System.out.println("Sa eshte gjatesia e brinjes B?");
        double gjatesiaB = input.nextDouble();

        double syprina = gjatesiaA * gjatesiaB / 2;

        System.out.println("Syprina e trekendshit kenddrejt eshte: " + syprina );

    }
}
