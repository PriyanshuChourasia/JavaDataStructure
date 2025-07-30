package JavaTut.Inheritence;

class Device{
    void powerOn(){
        System.out.println("Power is on....");
    }
}

class Laptop extends Device{
    void openIDE(){
        System.out.println("IDE is opening.....");
    }
}



public class Electronic {
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.openIDE();
    }
}
