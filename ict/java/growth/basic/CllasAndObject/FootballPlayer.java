package ict.kosovo.growth.basic.ora3.ict.java.growth.OOP.CllasAndObject;

import javax.swing.*;

public class FootballPlayer {
    private int no;
    private String name;
    private String surname;
    private String nickname;
    private String kembaPreferuar;
    private String club;
    private String nationality;
    private int pagesa;
    private int goals;
    private int matches;
    private int age;
    private int yearsOfCareer;

    //..defino sa ma shum

    //mundeni pa konstrukot

    public FootballPlayer() {

    }



    public FootballPlayer(String name, int age, String surname, String nationality, int goals, int matches, int yearsOfCareer, int pagesa) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.nationality = nationality;
        this.goals = goals;
        this.matches = matches;
        this.yearsOfCareer = yearsOfCareer;
        this.pagesa = pagesa;
    }

    //vetit get dhe set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
//GENERATE geterate get and set
    public String getSurname() {
        return surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public int getPagesa() {
        return pagesa;
    }

    public void setPagesa(int pagesa) {
        this.pagesa = pagesa;
    }

    public int getYearsOfCareer() {
        return yearsOfCareer;
    }

    public void setYearsOfCareer(int yearsOfCareer) {
        this.yearsOfCareer = yearsOfCareer;
    }
}