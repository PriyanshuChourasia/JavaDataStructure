package JavaTut.Encapsulation;


class Car{
    private int speed;

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){
        if(speed < 0){
            System.out.println("Speed is invalid");
            return;
        }
        this.speed = speed;
    }
}


public class Vehicle {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.setSpeed(34);
        System.out.println(bmw.getSpeed());
    }
}
