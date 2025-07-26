package JavaTut.chapterOne.ObjectComposition;

class Ram{
    int size;
}

class Cpu{
    int gen;
    String core;
}

class HardDisk{
    int storage;
}

class SSD{
    int storage;
}

class Laptop{
    String name;
    Ram ram = new Ram();
    Cpu cpu = new Cpu();
    HardDisk hardDisk = new HardDisk();
    SSD ssd = new SSD();

    void display(){
        System.out.println("Laptop Details: ");
        System.out.println("Name: "+this.name);
        System.out.println("Ram: "+this.ram.size+" GB");
        System.out.println("CPU Details");
        System.out.println("CPU: "+this.cpu.gen);
        System.out.println("CPU: "+this.cpu.core);
        System.out.println("Hard Drive: "+this.hardDisk.storage+" TB");
        if(this.ssd.storage != 0){
            System.out.println("SSD: "+this.ssd.storage+" GB");
        }

    }
}



public class PersonalComputer {
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.name = "Lenovo";
        laptop.ram.size = 32;
        laptop.cpu.core = "i3";
        laptop.cpu.gen = 12;
        laptop.hardDisk.storage = 1;
        laptop.ssd.storage = 500;
        laptop.display();
    }
}
