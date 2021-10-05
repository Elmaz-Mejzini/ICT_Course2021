package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;
import java.util.Scanner;
public class calc1 {



    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);

        System.out.println("Shkruani dy numra pozitiv:");

        // Reading data using readLine
        int p = calculate.nextInt();
        int q = calculate.nextInt();
        int sum, sub, mul, mod;
        float div;

        sum = p + q;
        sub = p - q;
        mul = p * q;
        div = p / q;
        mod = p % q;

        System.out.println("\n SHUMA         " + p + " + " + q + " = " + sum);
        System.out.println("DIFERENCA  " + p + " - " + q + " = " + sub);
        System.out.println("SHUMEZIMI     " + p + " * " + q + " = " + mul);
        System.out.println("PJESTIMI    " + p + " / " + q + " = " + div);
        System.out.println("MODULUSI     " + p + " % " + q + " = " + mod);
    }
}