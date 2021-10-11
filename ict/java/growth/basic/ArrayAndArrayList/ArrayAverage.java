package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.ArrayAndArrayList;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numrat = new int[]{10, 20, 30, 40};
        int shuma = 0;
for (int i = 0; i< numrat.length; i++)
    shuma = shuma + numrat[i];
        System.out.println("Shuma eshte" + shuma);

        double mesatarja = shuma/ numrat.length;
        System.out.println("Mesatrja eshte" + mesatarja);
    }
}