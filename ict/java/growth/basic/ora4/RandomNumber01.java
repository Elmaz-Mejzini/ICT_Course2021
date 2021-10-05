package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora4;

public class RandomNumber01 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();
        int t = (int) (r*N);
        System.out.println(t);
    }
}
