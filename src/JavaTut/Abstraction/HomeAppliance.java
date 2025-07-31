package JavaTut.Abstraction;

abstract class Appliance{
    abstract void turnOn();
    void plugIn(){
        System.out.println("Plugged In....");
    }
}

class Fan extends Appliance{
    @Override
    public void turnOn(){
        System.out.println("Fan turned on....");
    }
}

class WashingMachine extends Appliance{
    @Override
    public void turnOn(){
        System.out.println("Washing machine turned on.....");
    }
}



public class HomeAppliance {
    public static void main(String[] args){
        Appliance fan = new Fan();
        fan.plugIn();
        fan.turnOn();
        Appliance wash = new WashingMachine();
        wash.plugIn();
        wash.turnOn();
    }
}
