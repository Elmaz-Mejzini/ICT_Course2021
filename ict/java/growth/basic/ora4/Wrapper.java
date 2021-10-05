package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora4;

public class Wrapper {
    public static void main(String[] args) {
        String s1 = "25";
        byte b = Byte.parseByte(s1);
        System.out.println("byte eshte" + b);

        String s2 = "254654";
        int i=Integer.parseInt(s2);

        System.out.println("plus" + i);

        String s3 = "true";
        boolean bool = Boolean.parseBoolean(s3);
        System.out.println("..." + bool);

        String s4 = "3556";
        long l = Long.parseLong(s4);
        System.out.println("..." + l);

    }
}
