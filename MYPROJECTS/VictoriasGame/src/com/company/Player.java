package com.company;

import java.util.Scanner;

public class Player {
    private String name;
    private String gender;
    private  boolean hasSword = false;
    private  boolean hasSheild = false;
    private boolean foundNote = false;




    public Player( boolean hasSword, boolean hasSheild, boolean foundNote) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" What is the Players name?");

        this.name = scanner.nextLine();

       // scanner.nextLine();

        System.out.println("what is your gender");

       this.gender = scanner.nextLine();





        this.hasSword = hasSword;
        this.hasSheild = hasSheild;
        this.foundNote = foundNote;
    }
    public void playerMove(){
        //move player in direction typed
    }
}
