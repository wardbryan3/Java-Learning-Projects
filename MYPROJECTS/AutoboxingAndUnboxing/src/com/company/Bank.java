package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Branch> branchArrayList = new ArrayList<>();
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }

    public String getBankName() {
        return bankName;
    }

    public void newBranch(String branchName) {
        Branch branch = new Branch(branchName);
        getBranchArrayList().add(branch);
        System.out.println(branch.getBranchName());

        System.out.println("Enter name of first customer at this branch:");

        String customerName = scanner.nextLine();

        System.out.println("Minimum initial deposit is $100.");


        System.out.println("Enter the initial deposit for the customer:");

        double initialDeposit = scanner.nextDouble();

        if (initialDeposit >=100){
            Customer customer = new Customer(customerName, initialDeposit);
            branch.getCustomerArrayList().add(0,customer);
            customer.getTransactionArrayList().add(initialDeposit);
        }else {
            System.out.println("Not enough money to open an account.");
        }




    }



    public static boolean addNewCustomerToBranch(Branch branch) {
        System.out.println("Enter name of new customer at this branch:");
        scanner.nextLine();

        String customerName = scanner.nextLine();

        System.out.println("Minimum initial deposit is $100.");


        System.out.println("Enter the initial deposit for the customer:");

        double initialDeposit = scanner.nextDouble();

        Customer customer = new Customer(customerName,initialDeposit);



        return branch.addNewCustomerToBranch(customer, initialDeposit);





    }

    public static void addTransactionToCustomer(Branch branch) {
        System.out.println("Enter customer name that would like to make a transaction.");
        scanner.nextLine();

        String customerName = scanner.nextLine();

        Customer customer = branch.customerExists(customerName);
        System.out.println("Enter transaction amount: \nHint: Use negatives for withdrawals");


     //   scanner.nextLine();

        double transactionAmount = scanner.nextDouble();
        branch.addTransactionToCustomer(customer, transactionAmount);


    }

    public static void printBranchCustomerList(Branch branch) {
        for (int i = 0; i < branch.getCustomerArrayList().size(); i++){

            System.out.println(branch.getCustomerArrayList().get(i).getName());

            for (int o = 0; o < branch.getCustomerArrayList().get(i).getTransactionArrayList().size(); o++)

           System.out.println( branch.getCustomerArrayList().get( i ).getTransactionArrayList().get(o));

        }


    }
    public Branch branchExists (String branchName){
        int position = findBranch(branchName);
        if (position >= 0){
            return this.branchArrayList.get(position);

        }return null;
    }

    private  int findBranch (Branch branch){
        return this.branchArrayList.indexOf(branch);
    }

    private int findBranch(String branchName){
        for (int i = 0 ; i <= this.branchArrayList.size()-1; i ++){
            Branch branch = this.branchArrayList.get(i);

            if(branch.getBranchName().equals(branchName)){
                return i;
            }
        }return -1;

    }



}



