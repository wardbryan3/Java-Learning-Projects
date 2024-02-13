package com.company;

import java.util.Scanner;


class Intro {
    public static void intro() {
        System.out.println("You finally awaken, upon examining your surroundings you see...." + "\n" + "...nothing" + "\n" + "Would you like to feel around and see what you can find? ");

    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //accepts user input

        Player player = new Player(false, false, false); //main player of the game


        Intro.intro();

        //scanner.nextLine();

        //  if(scanner.nextLine().toLowerCase() == "yes"){
        //     System.out.println("you found the torch");
        // }


    }
}
