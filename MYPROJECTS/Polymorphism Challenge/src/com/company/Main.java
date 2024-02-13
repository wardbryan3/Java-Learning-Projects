package com.company;

class Car{
    private boolean engine;
    private boolean engineRunning = false;
    private int cylinders;
    private int wheels;
    private String model;
    public int speed;

    public Car( int cylinders, String model) {
        this.engine = true;
        this.engineRunning = false;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.model = model;
        this.speed = 0;
    }

    public void startEngine(){
        System.out.println("startEngine() called from Car class.");
       if (isEngineRunning() == false){
           engineRunning = true;
       }
    }

    public void stopEngine(){
        System.out.println("stopEngine() called from Car class.");
        if (isEngineRunning() == true){
            engineRunning = false;
        }
    }

    public void accelerate(){

        System.out.println("accelerate() called from Car class.");
        System.out.println("current speed: " + speed);
        speed ++;
        System.out.println("current speed: " + speed);

    }
    public void stop(){
        System.out.println("stop() called from Car class.");

        System.out.println("current speed: " + speed);

        speed = 0;

        System.out.println("current speed: " + speed);

    }

    public boolean isEngine() {

        return engine;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }


}

class Hurracan extends Car{
   public Hurracan(){
       super (8,"Hurracan");
       int speed = this.getSpeed();

    }
    @Override
    public void accelerate(){
       speed = speed + 5;
    }


}

class Sierra extends Car {
    public Sierra (){
        super (8,"Sierra");


    }
    @Override
    public void stop(){
        System.out.println("stop() called from Sierra subclass");

        System.out.println("current speed: " + speed);

        while (speed >=1){
            speed--;
            speed = speed/2;
            System.out.println("current speed: " + speed);

        }
        speed = 0;
        System.out.println("current speed: " + speed);


    }
}
class Outback extends Car {
    public Outback(){
        super(4,"Outback");
    }
}




public class Main {

    public static void main(String[] args) {
	    // write your code here
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Sierra mySierra = new Sierra ();
        mySierra.startEngine();
        mySierra.accelerate();
        mySierra.stop();









    }
}
