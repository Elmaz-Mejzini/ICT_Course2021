package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;
import java.util.Scanner;
public class LigjiGravitetit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sa eshte masa");
        double masa = input.nextDouble();

        System.out.println("Sa eshte graviteti:");
        double graviteti = input.nextDouble();

        double forca = masa * graviteti;
        System.out.println("Forca eshte" + forca);

    }
}
