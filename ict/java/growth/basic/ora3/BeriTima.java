package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

public class BeriTima {
    public static void main(String[] args) {
        int eurot = 3;
        int centet = 46;
        int parate = (eurot * 100) + centet;
        System.out.println("20 - centeshe ="+ parate / 20 );
        parate = parate%20;
        System.out.println("10 - centeshe ="+ parate / 10 );
        parate = parate%10;
        System.out.println("5 - centeshe ="+ parate / 5 );
        parate = parate%5;
        System.out.println("2 - centeshe ="+ parate / 2 );
        parate = parate%2;
        System.out.println("1 - centeshe ="+ parate / 1 );
        parate = parate%1;
    }
}
