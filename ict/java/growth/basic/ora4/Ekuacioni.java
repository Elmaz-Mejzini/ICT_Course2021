package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora4;
import java.util.Scanner;
public class Ekuacioni {
Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sheno vleren e pare: ");
        int a = sc.nextInt();
        System.out.print("Sheno vleren e dyte: ");
        int b = sc.nextInt();
        System.out.print("Sheno vleren e trete: ");
        int c = sc.nextInt();

        System.out.println(a+"x " + b+"y " + c + "=0");
        System.out.println("x1 = " + (-b + Math.sqrt(b*b + 4*a*c))/ (2*a) );
        System.out.println("x2 = " + (-b - Math.sqrt(b*b + 4*a*c))/ (2*a) );
    }
}