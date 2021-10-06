package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

import java.util.Scanner;

public class PagaNetoBonus {
    public static void main(String[] args) {
//        Një kompani vendosi t'i japë punonjësve bonus prej 5% nëse viti i shërbimit i
//tij/saj është më shumë se 5 vjet.
//Pyesni përdoruesin për pagën dhe vitin e shërbimit dhe shtypni shumën neto të
//bonusit.
        Scanner input = new Scanner(System.in);
        System.out.println("Ne cilin vit keni filluar punen?");
        int viti = input.nextInt();
        System.out.println("Sa eshte paga juaj");
        int paga = input.nextInt();
        int bonusi = paga / 20;
        System.out.println("Bonusi=" + bonusi);

        if (viti<2016)
            System.out.println("Ju keni fituar 5 % bonus, paga juaj tash eshte:" + (paga + bonusi) + "Euro");
        else System.out.println("Ju nuk i plotesoni kushtet per bonus");
    }
}
