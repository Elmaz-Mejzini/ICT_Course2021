package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

import java.util.Scanner;

public class RregullatEPunes {
//    Kerkoni nga përdoruesi per vendosur moshën, gjinin (M ose F), statusin
//martesor (P ose J) dhe me pas duke përdor rregullat e mëposhtme shtypni
//vendin e shërbimit?
//i. Nese punonjësi është femër, atëherë ajo do të punojë vetëm në zonat urbane
//ii. Nëse punonjësi është mashkull dhe mosha është nga 20 deri në 40 vjeç, atëherë ai
//mund të punojë kudo
//iii. Nëse punonjësi është mashkull dhe mosha është ndërmjet 40 dhe 60 atëherë ai do të
//punojë vetëm në zonat urbanë
//iv. Dhe çdo input tjetër për moshën shtypni mesazhin «GABIM»
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sa eshte mosha juaj?");
        int mosha = input.nextInt();
        System.out.println("Cila eshte gjinia juaj F apo M");
        char gjinia = input.next().charAt(0);
        System.out.println("I martuar (P), i pamartuar (J)");
        char martesa = input.next().charAt(0);

        if (gjinia == 'F') {
            System.out.println("Ju do te punoni vetem ne zonat urbane");
        }
            else if  (gjinia == 'M' && (mosha <= 40 && mosha >= 20)) {


            System.out.println("Ju mund te punoni ne qdo zone");
        }
            else if (gjinia == 'M' && mosha>=40 && mosha<=60) {
            System.out.println("Mund te punoni ne zonen urbane");
        }
            else {
                System.out.println("Ka probleme teknike");
        }





    }
}
