package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class Vlersimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sa pike keni aritur ne provim?");
        int piket = input.nextInt();

        if (piket<=49)
            System.out.println("Nota eshte 5");
        else if (piket>=50 & piket <= 59)
            System.out.println("Nota eshte 6");
        else if (piket>=60 & piket<=69)
            System.out.println("Nota eshte 7");
        else if (piket>=70 & piket<=79)
            System.out.println("Nota eshte 8");
        else if (piket>=80 & piket<=89)
            System.out.println("Nota eshte 9");
        else if (piket>=90 & piket<=100)
            System.out.println("Nota eshte 10");
        else System.out.println("Ju nuk keni shenuar numrin e sakt te pikeve te arritura");
    }
}
