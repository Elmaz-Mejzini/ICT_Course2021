package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.enums;

public class SeasonTest {
    public static void main(String[] args) {


    Season s =  Season.FALL;
    Season s1 = Season.FALL;
    Season s2 = Season.valueOf("WINTER");
    Season s3 = Season.SUMMER;


     if(s == s1) {
         System.out.println("Jane te njejt");
     }
             if(s.equals(s1)){
             System.out.println("Jane te njejt");

             }
        System.out.println(s1);
        System.out.println(s2);
     }
             }

