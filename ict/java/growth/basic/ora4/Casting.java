package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora4;

public class Casting {
    public static void main(String[] args) {
        byte b;
        int i = 122;
        double d = 105.142;
        System.out.println("Konvertimi nga int ne byte");
        b = (byte) i;
        System.out.println("b=" + b);
        System.out.println("i=" +i);

        i = (int) d;
        System.out.println("d=" +d);
        System.out.println("i=" + i);
        System.out.println("Konvertimi nga double ne byte");
        b=(byte)d;
        System.out.println("b=" +b );

    }
}
