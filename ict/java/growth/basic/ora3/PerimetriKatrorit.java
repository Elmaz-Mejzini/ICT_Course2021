package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class PerimetriKatrorit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sa eshte brinja A e katrorit");
        int brinja = input.nextInt();

        int perimetri = 4 * brinja;
        System.out.println("Perimetri Katrorit eshte: " + perimetri);


    }
}
