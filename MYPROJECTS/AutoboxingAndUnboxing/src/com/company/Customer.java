package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private static ArrayList<Double> transactionArrayList = new ArrayList<>();
    private double accountBalance;

    public Customer(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }


    public ArrayList<Double> getTransactionArrayList() {
        return transactionArrayList;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

}
