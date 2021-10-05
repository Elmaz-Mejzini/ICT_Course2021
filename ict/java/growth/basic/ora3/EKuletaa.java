package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;
import java.util.Scanner;
public class EKuletaa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sa1cenr, sa2cent, sa5cent, sa10cent, sa50cent, sa50euro, sa100euro, sa500euro;

        System.out.print("Sa 1 cent?");
        sa1cenr = reader.nextInt();

        System.out.print("sa 2 cent?");
        sa2cent = reader.nextInt();

        System.out.println("sa 5 cent?");
        sa5cent = reader.nextInt();

        System.out.println("sa 10 cent?");
        sa10cent = reader.nextInt();

        System.out.println("sa 50 cent?");
        sa50cent = reader.nextInt();

        System.out.println("sa 50 euro?");
        sa50euro = reader.nextInt();

        System.out.println("................");
        System.out.printf("Sa 1 centshe: %5d %10.2f %n", sa1cenr, sa1cenr*0.01);
        System.out.printf("Sa 2 centshe: %5d %10.2f %n", sa2cent, sa1cenr*0.02);
        System.out.printf("Sa 5 centshe: %5d %10.2f %n", sa5cent, sa5cent*0.03);
        System.out.printf("Sa 10 centshe: %5d %10.2f %n", sa10cent, sa10cent*0.10);
        System.out.printf("Sa 50 centshe: %5d %10.2f %n", sa50cent, sa50cent*0.50);
        System.out.printf("Sa 50 Euroshe: %5d %10.2f %n", sa50euro, sa50euro*50.0);
        System.out.println("-----------------------------------------");
        System.out.printf("Totali: %22.2f EUR %n", (sa1cenr * 0.01 + sa2cent * 0.02 + sa5cent * 0.05 + sa10cent * 0.10 + sa50cent * 0.50 + sa50euro * 50.0));
        System.out.println("-----------------------------------------");
        System.out.println("------------------");
    }
}
