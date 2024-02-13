package com.company;

import java.util.ArrayList;

public class Branch {
    private static ArrayList<Customer> customerArrayList = new ArrayList<>();
    private  String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }






    public static ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean addNewCustomerToBranch(Customer customer, double initialTransaction){

        if (findCustomer(customer.getName()) >= 0){
            System.out.println("Customer is already on record.");
            return false;

        }else if(initialTransaction < 100){

            System.out.println("Not enough money to open an account.");
            return false;
        }
        //else{

        customerArrayList.add(customer);
        int i = customerArrayList.indexOf(customer) ;
        customerArrayList.get(i).getTransactionArrayList().add(initialTransaction);


        //testing
        System.out.println("finished addNewCustomerToBranch" );
        return true;
        // }


    }

    public boolean addTransactionToCustomer (Customer customer, double transaction){
        double customerMoneySum = customer.getAccountBalance();


        if(customerMoneySum + transaction <= 0){
            System.out.println("Customer does not have the funds to complete transaction.");
            return false;

        } else if (findCustomer(customer.getName()) <=0 ) {
           System.out.println("Customer does not exist.");
           return false;
       }else  customer.getTransactionArrayList().add(transaction);
        customerMoneySum = customerMoneySum + transaction;
        return true;

    }






    public Customer customerExists (String customerName){
        int position = findCustomer(customerName);
        if (position >= 0){
            return this.customerArrayList.get(position);

        }return null;
    }

    private  int findCustomer (Customer customer){
        return this.customerArrayList.indexOf(customer);
    }

    private int findCustomer(String customerName){
        for (int i = 0 ; i <= this.customerArrayList.size()-1; i ++){
            Customer customer = this.customerArrayList.get(i);

            if(customer.getName().equals(customerName)){
                return i;
            }
        }return -1;

    }



}
