package JavaTut.chapterOne;

class Bike{

    void ride(){
        System.out.println("Biker is riding....");
    }
}


public class Vehicle {
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.ride();
    }
}
