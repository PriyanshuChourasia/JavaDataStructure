package JavaTut.Inheritence;


class Vehicle{
    String name;
    private int year;

    void move(){
        System.out.println("Vehicle is moving....");
    }
}

class Car extends Vehicle{
    void fueling(){
        System.out.println(name+" is fueling");
    }
}



public class Transport {
    public static void main(String[] args){
        Car mercedees = new Car();
        mercedees.name = "Mercedees Benz";
        mercedees.fueling();
        mercedees.move();
    }
}
