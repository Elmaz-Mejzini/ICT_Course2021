package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numri = input.nextInt();

        if (numri == 1 )
            System.out.println("Semafori i kuq");
        else if (numri==2)
            System.out.println("semafori i portokallt");
        else if (numri ==3)
            System.out.println("Semafori i gjelbert");
        else System.out.println("semafori nuk punon");
    }
}
