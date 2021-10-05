package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;
import java.util.Scanner;
public class eKuleta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");

        int sasiaCent1 = 0;
        double totaliCent1 =0 * 0.0 ;
        System.out.print("1 centshe:" + "    " + sasiaCent1 + "     " + totaliCent1 + " " + "EURO" + "\n" );

        int sasiaCent2 = 2;
        double totaliCent2 = 2 * 0.02;
        System.out.print("2 centshe:" + "    " + sasiaCent2 +"     " + totaliCent2 + " " + "EURO" + "\n");

        int sasiaCent5 = 10;
        double totaliCent5 = 0.05 * 10;
        System.out.print("5 centshe:" + "    " + sasiaCent5 +"    " + totaliCent5 + " " + "EURO" + "\n");

        int sasiaCent50 = 4;
        double totaliCent50 = 0.5 * 4;
        System.out.print("50 centshe:" + "   " + sasiaCent50 +"     " + totaliCent50 + " " + "EURO" + "\n");

        int euro1 = 1;
        double totalieuro1 = 3 * 1;
        System.out.print("1 euro:" + "       " + euro1 +"     " + totalieuro1 + " " + "EURO" + "\n");

        int euro2 = 2;
        double totalieuro2 = 2 * 2;
        System.out.print("2 euro:" + "       " + euro2 +"     " + totalieuro2 + " " + "EURO" + "\n");

        System.out.println("---------------------------------");

        System.out.print("Totali:             ");
        System.out.println(totaliCent1 + totaliCent2 + totaliCent5 + totaliCent50 + totalieuro1 + totalieuro2 + " EURO");
        System.out.println("---------------------------------");
    }
}
