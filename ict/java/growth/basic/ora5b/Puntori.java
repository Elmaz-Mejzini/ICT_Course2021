package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

import java.util.Scanner;
//Një dyqan do të japë zbritje prej 10% nëse kostoja e sasisë së blerë është më
//shumë se 1000.
//Pyete përdoruesin për sasine
//Supozoni, një njësi do të kushtojë 100 EUR.
//Gjykoni dhe shtypni koston totale për përdoruesit.
public class Puntori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sa eshte sasia e produkteve qe keni bler");
        int sasia = input.nextInt();
        int kosto = sasia * 100;
        System.out.println("Kosto eshte"+ kosto);
        int zbritja = (kosto - sasia + 10) / 10;
        System.out.println("zbritja eshte" + zbritja);

        int CmimiFinal = (kosto - zbritja);
        System.out.println("Cmimi me zbritje eshte" + CmimiFinal);

        if (sasia>=10)
            System.out.println("Ju keni marr qmimin me " + zbritja + "Euro Zbritje");
        else System.out.println("Nuk keni arritur produktin e caktuar per zbritje");




    }
}
