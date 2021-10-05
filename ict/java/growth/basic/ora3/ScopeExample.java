package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora3;

public class ScopeExample {
    public static void main(String[] args) {
        int x;
        x = 10;

        if (x == 10) { //new scope
            int y = 20; //known only to this block
            // x and y both known here
            System.out.println("x and y: " + x + "" + y);
            x = y * 2;
        }
        System.out.println("x eshte" + x);
    }
}
