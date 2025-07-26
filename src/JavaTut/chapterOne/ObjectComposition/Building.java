package JavaTut.chapterOne.ObjectComposition;

class Room{
    String name;
    void room(){
        System.out.println("This is "+this.name+" room");
    }
}

class House{
    String name;

    Room r1 = new Room();
    Room r2 = new Room();

    void display(){
        System.out.println("House name: "+this.name);
        r1.room();
        r2.room();
    }
}

public class Building {
    public static void main(String[] args){
        House house = new House();
        house.name = "Shanti Home";
        house.r1.name = "Bed";
        house.r2.name = "Kitchen";
        house.display();
    }
}
