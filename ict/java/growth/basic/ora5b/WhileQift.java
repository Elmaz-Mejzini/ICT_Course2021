package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

import java.util.Scanner;

public class WhileQift {
    //Te shtypen numrat çift nga 2 deri ne N (N – vlera e marrur nga shfrytezuesi)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deri ne cilin numer qift duhet te vazhdoj numrimi?");


        int numri = 0, N = input.nextInt();
        while (numri<N) {


            numri=numri+2;

            System.out.println("Rangu i numrave eshte" + numri);
        }
    }
}
