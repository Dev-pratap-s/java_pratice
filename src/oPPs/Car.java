package oPPs;

public class Car {

    //fields, attributes, properties
    String color;
    String brand;
    int speed;



    //behaviour(method)  /action
    public void run(){
        System.out.println("oPPs.Car is running " +speed);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.speed=100;
        car1.run();



    }
}
