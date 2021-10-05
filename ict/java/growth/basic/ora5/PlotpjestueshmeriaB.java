package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;

public class PlotpjestueshmeriaB
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Shkruaj numrin e par");
            int numri1 = input.nextInt();
            System.out.println("shkruaj numrin e dyte");
            int numri2 = input.nextInt();


            if (numri2 % numri1 == 0)
                System.out.println("Jane te plotpjestueshme");
            else System.out.println("nuk plotpjestohen");
        }
    }

