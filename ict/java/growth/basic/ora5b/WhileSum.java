package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

public class WhileSum {
    public static void main(String[] args) {
        //Shuma e 100 numrave te pare pozitiv

        int numri = 1, sum = 0;

        while(numri <= 100)
        {
//adding the value of numri into sum variable
            sum += numri;


            numri++;

        }

        System.out.println("Shuma e 100 numrave te pare eshte= " + sum);
    }
}


