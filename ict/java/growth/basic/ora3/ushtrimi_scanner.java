package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

import java.util.Scanner;

public class ushtrimi_scanner {
    public static void main(String[] args) {
    Scanner user = new Scanner(System.in); // objekti qe mundson te lexoj qfar shkruan perdorusi
        System.out.println("Zgjedhni username: "); //naimsulejmani
        String username = user.nextLine();
        System.out.println("username i zgjedhur eshte " + username);

    }
}


