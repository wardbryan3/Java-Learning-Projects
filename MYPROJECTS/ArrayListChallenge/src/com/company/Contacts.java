package com.company;

import java.util.Scanner;

public class Contacts {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private String number;

    public Contacts() {
        System.out.println("Please enter name for new Contact : ");
        this.name = scanner.nextLine();
        System.out.println("Please enter number for new Contact : ");
        this.number = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
