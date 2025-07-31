package JavaTut.Polymorphism.interfaces;

interface Transport{
    void move();
}

class Car implements Transport{
    public void move(){
        System.out.println("Car is moving....");
    }
}

class Boat implements Transport{
    public void move(){
        System.out.println("Boat is moving....");
    }
}



public class Travel {
    public static void main(String[] args){
        Transport t = new Car();
        t.move();
        Transport boat = new Boat();
        boat.move();
    }
}
