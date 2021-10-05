package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;
//Te shkruhet aplikacioni i cili shfaq menute dhe menyren e perzgjedhjes se tyre,
//pas perzgjedhjes te shfaqet mesazhi per menu-ne e perzgjedhur?
//1 – File
//2 – Edit
//3 –View
//4 – Help
//5 - Tools
//Tjeter – Per Exit
public class Menyja1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Shkruaj 1 – File– 2- Edit– 3- View– 4- Help 5-Tools");
        int numri = input.nextInt();

        switch (numri) {
            case 1:
                System.out.println("Ju keni zgjedhur File");
                break;
            case 2:
                System.out.println("Keni zgjedhur edit");
                break;

            case 3:
                System.out.println("Ju keni zgjedhur View");
                break;
            case 4:
                System.out.println("Keni zgjedhur Help");
                break;
            case 5:
                System.out.println("Keni zgjedhur Tools");
            default:
                System.out.println("Nuk keni zgjedhur numrin e kerkuar.");
                break;
        }
    }
}

