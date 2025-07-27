package JavaTut.chapterTwo;

class Weapon{
    String name;

    Weapon(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Weapon Name: "+this.name);
    }
}

class GCharacter{
    String name;
    int level;
    Weapon weapon;
    GCharacter(String name, int level, Weapon weapon){
        this.name = name;
        this.level = level;
        this.weapon = weapon;
    }

    void display(){
        System.out.println("Game Details: ");
        System.out.println("Name: "+this.name);
        System.out.println("Level: "+this.level);
        weapon.display();
    }
}


public class GameCharacter {
    public static void main(String[] args){
        Weapon weapon = new Weapon("Hammer");
        GCharacter gCharacter = new GCharacter("Gau",13,weapon);
        gCharacter.display();
    }
}
