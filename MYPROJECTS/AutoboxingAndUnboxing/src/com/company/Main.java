package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // And also a name
        // Each Branch should have an arraylist of Customers
        // and also a name
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction

        // Add a transaction for an existing customer for that branch

        // Show a list of customers for a particular branch and optionally a list

        // of their transactions

        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions
        //etc need to be able to print list of  customers and  customer transactions add customers to branches and transactions to customers and do not forget to sum the transactions to get the account total;


        //current error: all transactions are saved to all contacts





        Bank bank = new Bank("US Bank");


       int choice = 0;
        boolean quit = false;
        printInstructions();


        while (!quit) {
            System.out.println("Enter your choice: " +
                    "\nHint: Enter 0 to reprint options." );
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    createNewBranch(bank);
                    break;
                case 2:
                    addCustomerToBranch(bank);
                    break;
                case 3:
                   printCustomersAndTransactions(bank);
                   break;
                case 4:
                    addTransactionToCustomer(bank);
                    break;
                default:
                    quit = true;
                    break;

            }


        }
    }

    public static void printInstructions(){
        System.out.println("Options:" +
                "\n Enter 0 to reprint options." +
                "\n Enter 1 to create a new branch for the bank." +
                "\n Enter 2 to add a customer to a branch." +
                "\n Enter 3 to print customers and transactions from a branch." +
                "\n Enter 4 to add a transaction to a customer.");
    }

    public static void createNewBranch(Bank bank) {
        System.out.println("Enter name for new branch: ");
        scanner.nextLine();
        String newBranchName = scanner.nextLine();
        bank.newBranch(newBranchName);
    }

    public static void addCustomerToBranch(Bank bank) {
        System.out.println("Enter branch you would like to add to: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branch branch = bank.branchExists(branchName);
        bank.addNewCustomerToBranch(branch);
    }
    public static void printCustomersAndTransactions (Bank bank){
        System.out.println("Which branch would you like to print contacts and transactions from??");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branch branch = bank.branchExists(branchName);

        bank.printBranchCustomerList(branch);
    }


    public static void addTransactionToCustomer (Bank bank){
        System.out.println("Which branch would you like to print contacts and transactions from??");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branch branch = bank.branchExists(branchName);


        bank.addTransactionToCustomer(branch);
    }
}

