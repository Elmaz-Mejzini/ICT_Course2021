package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora4;

public class Casting2 {
    public static void main(String[] args) {
byte b = 43;
short s = 1034;
char c = 'a'; //c=97
 int i = 5000;
 float f = 5.67f;
 double d = 0.1234;
 double rezultati = (f * b) + (i/c) - (d*s);
        System.out.println("f*b =" + (f*b));
        System.out.println("i/c =" + (i/c));
        System.out.println("d*s =" + (d*s));
        System.out.println("Rezultati perfundimtat: " + rezultati);
    }
}
