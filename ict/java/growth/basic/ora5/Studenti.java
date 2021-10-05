package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;
//Të shkruhet programi për vijueshmërinë studentit?
// Të zgjidhet emri dhe mbiemri i studentit
// Të shkruhet numri i orëve për lende (rasti jone 80)
// Të shkruhet numri i orëve qe ka ndjek student
// Të kalkulohet %e pjesëmarrjes?
// Nëse % është me madhe se 49% atëherë te shfaqet mesazhi qe studenti i ploteson
//kushtet per provim
// Nëse % është 100%, atëherë studenti ka 10 pike bonus për lenden
// Nëse studenti ka nder 50% atëherë te shfaqet mesazhi se studenti nuk i plotëson kushtet
//për provim
import java.util.Scanner;

public class Studenti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Emri dhe Mbiemri:");
        String emri = input.nextLine();

        int numriOreve = 80;
        int numriOreveTeNdjekura = 60;
        int perqindja = (numriOreve/numriOreveTeNdjekura) * 100;
        System.out.println("Nga numri total i oreve  " + numriOreve   + "Studenti   "  +emri + "  ka ndjekur  " + numriOreveTeNdjekura + "  ose ne perqindje" + perqindja + "%");

        if (perqindja>49)
            System.out.println("Studenti ploteson kushtet per provim");
        else if (perqindja==100)
            System.out.println("Studenti ka 10 perqind bonus");

        else if (perqindja<50)
            System.out.println("Studenti nuk lejohet ne provim");
        else System.out.println("Per me shume kontaktoni ne email");
    }
}
