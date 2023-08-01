package com.cc.java;


public class App {
    // Methode zum Drucken der Mitarbeiterdaten
    public static void printEmployeeData(Mitarbeiter employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getFamilyName());
        System.out.println("Birth Year: " + employee.getBirthYear());
        System.out.println("Work ID: " + employee.getWorkID());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Role: " + employee.getRole());
        employee.performAction(); // Aufruf der spezifischen Aktion für jeden Mitarbeiter
        System.out.println();
    }

    public static void main(String[] args) {
        Mitarbeiter employee1 = new Mitarbeiter("Smith", "John", 1985, "ID123", "Accounting", "Accountant", 2018);
        Mitarbeiter employee2 = new Mitarbeiter("Johnson", "Alice", 1990, "ID456", "Manufacturing", "Engineer", 2015);
        Mitarbeiter employee3 = new Mitarbeiter("Doe", "Jane", 1988, "ID789", "Advertising", "Marketer", 2019);

        // Ausgabe der spezifischen Daten für jeden Mitarbeiter
        System.out.println("Employee 1:");
        printEmployeeData(employee1);

        System.out.println("Employee 2:");
        printEmployeeData(employee2);

        System.out.println("Employee 3:");
        printEmployeeData(employee3);

        // Testen der spezifischen Methoden für die einzelnen Abteilungen
        Accounting.doYourJob();
        Manufacturing.doYourJob();
        Advertising.doYourJob();
    }
}
