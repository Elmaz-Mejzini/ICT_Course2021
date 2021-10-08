package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

public class Date {
    private int day, month, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day<=0 || day>31) return;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>=1 && month <=12)
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=1900) return;
        this.year = year;
    }
    public void print() { //METODA PRINT
        System.out.println("Data:  " + month + ". " + day + " ." + year);

    }
}
