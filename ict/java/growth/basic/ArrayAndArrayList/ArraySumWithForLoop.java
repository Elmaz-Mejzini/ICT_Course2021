package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.ArrayAndArrayList;

public class ArraySumWithForLoop {
    public static void main(String[] args) {
        int [] numrat = {
                10,20,30,40,51
        };
        int sum = 0;
        for (int i : numrat)
            sum += i;
        System.out.println("Shuma eshte =" + sum);
    };
}
