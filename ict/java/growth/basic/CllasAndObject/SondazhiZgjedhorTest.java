package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

import java.util.Scanner;

public class SondazhiZgjedhorTest {
    public static void main(String[] args) {


        SondazhiZgjedhor input = new SondazhiZgjedhor();
        input.setKandidati("Elmaz Mejzini");
        input.setKomuna("Dragash");
        input.setNumriVotueseve(1000);
        input.setPartia("Pnnk");
        input.setPerqindjaVotueseve(78);
        input.setRezultati(22);

        SondazhiZgjedhor input2 = new SondazhiZgjedhor();
        input2.setKandidati("Askush Mejzini");
        input2.setKomuna("Prizren");
        input2.setNumriVotueseve(2000);
        input2.setPartia("PNK");
        input2.setPerqindjaVotueseve(718);
        input2.setRezultati(22);

        System.out.println("Kandidati  " + input.getKandidati() );
        System.out.println("Komuna     " + input.getKomuna() +    "   Votues  " + input.getNumriVotueseve());
        System.out.println("Partia     " + input.getPartia());
        System.out.println("Fitoi      " + input.getRezultati() + " %  ");
        System.out.println("............................................................");
        System.out.println("Kandidati  " + input2.getKandidati() );
        System.out.println("Komuna     " + input2.getKomuna() +    "   Votues  " + input.getNumriVotueseve());
        System.out.println("Partia     " + input2.getPartia());
        System.out.println("Fitoi      " + input2.getRezultati() + " %  ");

    }
}

