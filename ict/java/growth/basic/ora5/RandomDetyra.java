package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Random;

public class RandomDetyra {
//     Të shkruhet program qe gjeneroj një numër ne prapavije (random) dhe kërkon
//shfrytëzuesit qe t'ia qëllon numrin e gjeneruar nga 0 deri ne 10
// Nëse e qëllon te shfaqet mesazhi “urime e keni qelluar”
// Nëse nuk e qëllon “suksese herën tjetër”
    public static void main(String[] args) {
      System.out.println("Shkruaj nje numer sipas deshires:");
        Scanner input = new Scanner(System.in);
        double numri = input.nextDouble();
        Random reader = new Random();
        double random_number = reader.nextDouble(100); // bound - kufiri
        System.out.println( Math.round(random_number));

        if (random_number == numri)
            System.out.println("Urime e keni qelluaar");
        else System.out.println("Me shume fat herave tjera");

    }
}


    }
}
