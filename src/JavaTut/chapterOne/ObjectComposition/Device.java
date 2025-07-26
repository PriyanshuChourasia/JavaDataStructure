package JavaTut.chapterOne.ObjectComposition;

class Battery{
    int battery;

    void displayBattery(){
        System.out.println("Battery Level: "+this.battery);
    }
}


class Phone{
    String name;
    Battery battery = new Battery();

    void display(){
        System.out.println("Name: "+this.name);
        battery.displayBattery();
    }
}


public class Device {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.name = "IPhone";
        phone.battery.battery = 96;
        phone.display();
    }
}
