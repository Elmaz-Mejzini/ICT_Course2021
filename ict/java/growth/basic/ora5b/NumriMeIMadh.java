package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

import java.util.Scanner;

public class NumriMeIMadh {
    public static void main(String[] args) {
//Merrni dy vlera int nga përdoruesi dhe shtypni më të madhin midis tyre
        Scanner input = new Scanner(System.in);
                System.out.println("Shkruaj numrin e pare: ");
                int n1 = input.nextInt();
                System.out.println("Shkruaj numrin e dyte: ");
                int n2 = input.nextInt();

                System.out.println("opcionet : ");
                System.out.println("1) Numri me i madh");
                System.out.println("2) Numri me i vogel");
                System.out.println("Per te shfaqur numrin me te madh shtyp 1, per me te voglin shtyp 2");
                int choice = input.nextInt();

                switch(choice) {
                    case 1:
                        int largest = Math.max(n1, n2);
                        System.out.printf("Me i madhi eshte : %d", largest);
                        break;
                    case 2:
                        int smallest = Math.min(n1, n2);
                        System.out.printf("Me i vogli eshte : %d", smallest);
                        break;
                }
            }
}
