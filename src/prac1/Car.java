package prac1;

public class Car {
    String company = "HYUNDAI MOTORS";
    String model = "Genesis GV80";
    String color = "White";
    int maxSpeed = 350;
    int speed;


    Car(){

    }
    Car(String model){
        this.model = model;
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
