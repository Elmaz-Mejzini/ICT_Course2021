package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5;

import java.util.Scanner;
//Te shkruhet program I cili pranon dy numra dhe operatorin (+,-,/,*,%) dhe I cili
  //varesisht nga operatori qe ka zgjedhur gjen rezultatin?
public class Calc2 {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);


        System.out.println("Zgjedh operatorin: +, -, *, ose /");
        operator = input.next().charAt(0);


        System.out.println("Shkruaj numrin e pare");
        number1 = input.nextDouble();

        System.out.println("Shkruaj numrin e dyte");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;



            default:
                System.out.println("Invalid operator!");
                break;
        }


    }

    }

