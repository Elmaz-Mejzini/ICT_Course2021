package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer input = new FootballPlayer();
        input.setName("Elmaz");
        input.setAge(23);
        input.setSurname("Mejzini");
        input.setNationality("Shqiptar");
        input.setClub("Liverpool");
        input.setGoals(100);
        input.setYearsOfCareer(7);
        input.setPagesa(200000);

        FootballPlayer input2 = new FootballPlayer();
        input2.setName("Enis");
        input2.setAge(20);
        input2.setSurname("Kosova");
        input2.setNationality("Kosovar");
        input2.setClub("Arsenal");
        input2.setGoals(99);
        input2.setPagesa(4440000);
        input2.setYearsOfCareer(4);

        System.out.println("emri  " + input.getName() +  "  Mosha  " + input.getAge() +   "  Mbiemri  " + input.getSurname() + "   Kombesia " + input.getSurname() + "   Klubi" + input.getClub() + "   Golat" + input.getGoals() + "  Pervoja futbollistike  " + input.getYearsOfCareer() + "Rroga" + input.getPagesa() );
        System.out.println("emri  " + input2.getName() + "  Mosha  " + input2.getAge() +  "  Mbiemri  " + input2.getSurname() + "  Kombesia " + input2.getSurname() + "   Klubi" + input2.getClub() + "  Golat" + input2.getGoals() + "  Pervoja futbollistike" + input2.getYearsOfCareer() + "Rroga" + input2.getPagesa());

    }
}
