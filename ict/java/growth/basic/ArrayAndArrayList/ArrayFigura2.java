package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.ArrayAndArrayList;

public class ArrayFigura2 {
    public static void main(String[] args) {
        int[][] figura2 = new int[5][5];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d ", figura2[i][j]);
            }
            System.out.println();
        }
    }
}
