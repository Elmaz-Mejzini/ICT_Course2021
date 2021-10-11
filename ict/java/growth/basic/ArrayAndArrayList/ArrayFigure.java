package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.ArrayAndArrayList;

public class ArrayFigure {
    public static void main(String[] args) {
        int[][] figura = new int[10][10];
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d ", figura[i][j]);
            }
            System.out.println();
        }
    }
}
