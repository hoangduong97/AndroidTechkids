package com.example.asusa42f.hwpracticebasicwidget;

import java.io.Serializable;

/**
 * Created by AsusA42F on 4/7/2016.
 */
public class Employee implements Serializable {
    private String name;
    private int age;
    private int birthDate;
    private int birthMonth;
    private int birthYear;

    public Employee(String name, int age, int birthDate, int birthMonth, int birthYear) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
