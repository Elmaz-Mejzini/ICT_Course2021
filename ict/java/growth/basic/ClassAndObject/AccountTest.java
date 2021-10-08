package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

public class AccountTest {
    public static void main(String[] args) {
        //deklarimi i objekt variable
        Account naimisAccount = new Account();
//        naimisAccount.name = "Naim";
        naimisAccount.setName("Naim Sulejmani");
        System.out.println(naimisAccount.getName());
    }
}
