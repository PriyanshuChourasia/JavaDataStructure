package JavaTut.chapterOne;
/*
* Class: A class is a blueprint for creating objects, providing a structured way to organize data and behavior.
*
* Object: An object is an actual car which will be built with the help of a blueprint car
* */

class Car{
    String color;
    String brand;
    int speed;

    void drive(){
        System.out.println("The car is driving");
    }
}


public class Main {
    public static void main(String[] args){
        Car car  = new Car();
        car.brand = "Toyota";
        car.color = "red";
        car.speed = 23;

        System.out.println("Brand: "+car.brand);
        System.out.println("Color: "+car.color);
        System.out.println("Speed: "+car.speed);

        car.drive();
    }
}
