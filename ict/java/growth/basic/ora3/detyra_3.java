
package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;
public class detyra_3 {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Stadiumi");
        String stadiumiKs = sc.nextLine();
        System.out.print("Ekipi vendas:");
        String ekipiVendas=sc.nextLine();
        System.out.print("Ekipi musafir:");
        String ekipiMusafir=sc.nextLine();
        System.out.print("Nr. i tifozeve:");
        int tifozet=sc.nextInt();




        System.out.print("Sa gola ka shenuar"+ " " + ekipiVendas +":");
        int gVendas=sc.nextInt();
        System.out.print("Sa gola ka shenuar"+ " " + ekipiMusafir+":");
        int gMusafir=sc.nextInt();
        System.out.println("------------------------------");
        System.out.println("Rezultati:");
        System.out.println(ekipiVendas+"-"+ekipiMusafir+" "+gVendas+"-"+gMusafir + " ne " + stadiumiKs);

    }
}

