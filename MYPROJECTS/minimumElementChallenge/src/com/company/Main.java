package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] challengeArray = new int[0];

        challengeArray = readIntegers(5);


        System.out.println("Minimum element is " + findMin(challengeArray));




    }
    private static int[] readIntegers(int count){
        int[] containingArray = new int[count];
        for( int i = 0; i < containingArray.length; i++){

            System.out.println("Please enter element:" );

            containingArray[i] = scanner.nextInt();

            System.out.println( Arrays.toString(containingArray) );
        }


        return containingArray;
    }

    private static int findMin(int[] arrayToSort){
        int minElement;

        minElement = arrayToSort[0];
        boolean hasChanged = true;
        while(hasChanged)
            hasChanged = false;

        for(int i = 0 ; i < arrayToSort.length; i++){
            if (arrayToSort[i] < minElement){
                minElement = arrayToSort[i];
                hasChanged = true;
            }
        }

        return minElement;
    }
}
