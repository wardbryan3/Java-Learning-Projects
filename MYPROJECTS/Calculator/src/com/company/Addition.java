package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addition extends OperationsAbstract {

    Scanner scanner = new Scanner(System.in);


    int firstNumber;
    ArrayList<Integer> integersToAdd = new ArrayList<>();
    int sum;


    public Addition() {

        boolean quit = false;
        int choice;


        System.out.println("You have chosen addition!\n" +
                "Please enter the first number you would like to add");

        firstNumber = scanner.nextInt();
        scanner.nextLine();
        while (!quit) {
            System.out.println("Enter 0 to sum numbers and quit. \n" +
                    "Enter 1 to enter another number.");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:

                    if (integersToAdd.size() > 0) {
                        sum = sum + firstNumber;

                        for (int i = 0; i < integersToAdd.size(); i++) {

                            int newNumber = integersToAdd.get(i);


                            System.out.println("Added: " + newNumber + "\n" +
                                    "to :" + sum);
                            sum = sum + newNumber;
                            System.out.println(sum + " is now the sum");
                        }


                    } else {

                        sum = firstNumber;
                    }
                    System.out.println("The sum of all entered numbers is: " + sum);
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter another number: ");
                    integersToAdd.add(scanner.nextInt());

                    break;


            }

        }

    }
}
