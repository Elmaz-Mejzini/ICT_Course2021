package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class DrejtkendshApoKatror {
    public static void main(String[] args) {
//        Merrni vlerat e gjatësisë dhe gjerësisë së një drejtkëndëshi nga përdoruesi dhe
//kontrolloni nëse është katror apo jo.

        Scanner input = new Scanner(System.in);
        System.out.println("Sa eshte gjatesia ?");
        int gjatesiaD = input.nextInt();
        System.out.println("Sa eshte gjeresia?");
        int gjeresiaD = input.nextInt();

        if (gjatesiaD == gjeresiaD)
            System.out.println("eshte katror");

    }
}
