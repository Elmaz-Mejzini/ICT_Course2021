package ict.kosovo.growth.basic.ora3.ict.java.growth.basic.ora5b;

public class AlphabetRow {
        public static void main(String args[]){
            char ch;//char variable declaration
//Printing upper case Alphabets
            System.out.println("Uppercase Alphabets are: \n");
            ch='A';
            while(ch<='Z'){
                System.out.print(ch+" ");
//display uppercase Alphabets with space
                ch++;
            }
            System.out.print("\n");//move to next line

//Printing lower case Alphabets
            System.out.println("Lowercase Alphabets are: \n");
            ch='a';
            while(ch<='z'){
                System.out.print(ch+" ");
//display lowercase Alphabets with space
                ch++;
            }

        }

    }

