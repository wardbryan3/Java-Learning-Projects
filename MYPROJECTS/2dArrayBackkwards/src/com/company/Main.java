package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;



public class Main {

    public static void main(String[] args) throws FileNotFoundException{

        //open file containing a 2-d array
        Scanner scanner = new Scanner(new File("input.txt"));

        //new PrintWriter
        PrintWriter output = new PrintWriter(new File("output.txt"));

        //loop through the input and add it to an ArrayList

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        while (scanner.hasNextInt()){
            integerArrayList.add(scanner.nextInt());
        }
        System.out.println(integerArrayList);

        for (int i = integerArrayList.size() - 1;i >= 0; i -= 2 ){
            integerArrayList.remove(i);
        }


        for (int i = integerArrayList.size() - 1;i >= 0; i -- ){
            int next = integerArrayList.get(i);
            System.out.println(next);
            output.printf("%8d",next);
        }


        output.close();
    }
}
