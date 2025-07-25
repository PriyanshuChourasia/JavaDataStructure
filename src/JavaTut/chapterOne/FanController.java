package JavaTut.chapterOne;

class Fan{
    int speed;
    String color;

    void turnOn(){
        System.out.println("Turning on....");
    }

    void turnOff(){
        System.out.println("Turning off....");
    }
}


public class FanController {
    public static void main(String[] args){
        Fan fan = new Fan();
        fan.speed = 4;
        fan.color = "Black";
        fan.turnOn();
        fan.turnOff();
    }
}
