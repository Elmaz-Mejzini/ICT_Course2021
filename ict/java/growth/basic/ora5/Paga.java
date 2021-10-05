package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class Paga {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int rroga = input.nextInt();

        if (rroga<80)
            System.out.println("Pa page");
        else if (rroga>80 & rroga < 130)
            System.out.println("Ndihme Sociale");
        else if (rroga>130 & rroga <200)
            System.out.println("Paga minimale");
        else System.out.println("Page komode");

    }
}
