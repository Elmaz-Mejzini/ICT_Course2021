package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;


public class Detyra1 {
    public static void main(String[] args) {
        //Te shkruhet programi i cili kërkon prej përdoruesit nje tekst
        //a) Pasi shfrytëzuesi te shkruan tekstin atëherë programi shfaq ne program numrin e karaktereve qe teksti përmban?
        //b) Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin: Shkruaj indeksin nga 0 deri me A (A- gjatësia e tekstit paraprak) për ta paraqitur tekstin nga indeksi deri ne fund:Pasi shfrytëzuesi shkruan atë numër të shfaqet pjesa e tekstit nga indeksi deri ne fund
        //c) Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin: Shkruaj indeksin e fillimit nga 0 deri me A (A- gjatësia e tekstit paraprak): XShkruaj indeksin e mbarimit nga X deri me A (X- vlera e indeksit te fillimit):YPasi shfrytëzuesi shkruan atë numër te shfaqet pjesa e e tekstit nga indeksi I fillimit deri te indeksi I fundit. Te validohet indeksi 
        //d) Pasi shfrytëzuesi te shkruan tekstin atëherë program paraqet mesazhin:Shkruaj fjalën qe po kërkoni: “fjala”Pastaj program shfaq mesazhin: Fjala e dhënë “fjala” gjendet/nuk gjendet ne tekst:Nëse gjendet ne tekst atëherë shfaqe indeksin se ku fillon ajo fjale ne tekst
        //e) Pasi shfrytëzuesi te jep tekstin atëherë program paraqet mesazhin:Shkruaj tekstin qe po kërkoni ta zëvendësoni: “fjala”Shkruani tekstin zëvendësues: “fjalaTjeter”Paraqitni tekstin me ndryshime?
        //Nëse nuk ka ndryshime shkruani mesazhin që teksti fjala nuk gjendet ne tekstin e dhënë dhe teksti nuk pësoi ndryshime

        Scanner input = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst?");
        String text1 = input.nextLine();
        System.out.println("Numri i karaktereve eshte: " + text1.length());

        System.out.println("Shkruaj indeksin nga 0 deri ne a ku A eshte gjatesia e tekstit paraprak");
        int indeksi = input.nextInt();


    }
}
