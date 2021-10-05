package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;
//Te shkruhet nje program I cili pranon nga -10000 deri ne 10000. Nese eshte
//shkruar brenda ketij rangu te shfaqet mesazhi“numri eshte ne rangun e dhene”
//perndryshe te shfaqet mesazhi“numri nuk eshte ne rangun e dhene”
public class Rangu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Shkruaj nje numer");
        int numri = input.nextInt();

        if (numri <= 10000 && numri >= -10000)
            System.out.println("Nummri eshte ne rangun e dhene");
        else System.out.println("Numri nuk eshte ne rangun  e dhene");
    }
}
