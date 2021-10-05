package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class SyprinaDrejtkendshit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gjatsia e brinjes A te drejtkendshit eshte:");
        int gjatesia = input.nextInt();

        System.out.println("Gjatesia e brinjes B te drejtekndshit eshte:");
        int gjatesiaB = input.nextInt();

        int syprina = gjatesia * gjatesiaB;
        System.out.println("Syprina e drejtekendshit eshte" + syprina);

    }
}
