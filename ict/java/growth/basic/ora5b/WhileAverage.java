package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

public class WhileAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (count<10)
        {
            count++;
            sum+=count;
        }
    double avg = (double) sum/count;
        System.out.println("Average=" + avg);
    }
}
