package com.cc.java;

// Mitarbeiter.java
import java.time.LocalDate;
import java.time.Period;

public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private int birthYear;
    private final String workID;
    private String department;
    private String role;
    private final int hiredYear;

    // Konstruktor
    public Mitarbeiter(String familyName, String firstName, int birthYear, String workID, String department, String role, int hiredYear) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
        this.hiredYear = hiredYear;
    }

    // Getter Methoden (ohne Setter, um die Unveränderbarkeit zu gewährleisten)
    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getWorkID() {
        return workID;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Öffentliche Methoden
    public void hasLunch() {
        System.out.println("Hi, I'm " + firstName + " and I'm having lunch!");
    }

    public void startsWork() {
        System.out.println("Hi, I'm " + firstName + " and I'm starting my work at the " + department + " department!");
    }

    public String getEmployedTime() {
        int yearsOfEmployment = Period.between(LocalDate.of(hiredYear, 1, 1), LocalDate.now()).getYears();
        return "Hi, I'm " + firstName + " and I've been working here since " + yearsOfEmployment + " years.";
    }

    // Eine Methode, um die spezifische Aktion für jeden Mitarbeiter auszuführen
    public void performAction() {
        if (this.getWorkID().equals("ID123")) {
            hasLunch();
        } else if (this.getWorkID().equals("ID456")) {
            startsWork();
        } else if (this.getWorkID().equals("ID789")) {
            System.out.println(getEmployedTime());
        }
    }

}
