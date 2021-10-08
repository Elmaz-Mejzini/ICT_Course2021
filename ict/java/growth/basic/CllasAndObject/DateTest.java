package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDay(16);
        System.out.println(d1.getDay());
        d1.setDay(8);
        d1.setMonth(12);
        d1.setYear(2012);
        d1.print();

        //LocalDateTime dataAktuale = LocalDateTime.now();
        //LocalDate bestBefore = LocalDate.from();
    }
}
