package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;
import java.util.Scanner;
public class SyprinaKatrorit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gjatsia e brinjeve te katrorit eshte:");
        int gjatesia = input.nextInt();

        int syprina = gjatesia * gjatesia;
        System.out.println("Syprina e katrorit eshte" + syprina);



    }
}
