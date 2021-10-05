package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Random;

public class RandomDetyra {
//     Të shkruhet program qe gjeneroj një numër ne prapavije (random) dhe kërkon
//shfrytëzuesit qe t'ia qëllon numrin e gjeneruar nga 0 deri ne 10
// Nëse e qëllon te shfaqet mesazhi “urime e keni qelluar”
// Nëse nuk e qëllon “suksese herën tjetër”
    public static void main(String[] args) {
        Random random_number_generator = new Random();
        int random_number = random_number_generator.nextInt(25);
        System.out.println(random_number);

    }
}
