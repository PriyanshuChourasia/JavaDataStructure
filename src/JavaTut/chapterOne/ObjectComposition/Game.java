package JavaTut.chapterOne.ObjectComposition;

class Weapon{
    int hitpoint;
    int level;

}

class Armor{
    String durable;
    int level;
}

class Character{
    String name;
    Weapon weapon = new Weapon();
    Armor armor  = new Armor();

    void display(){
        System.out.println("Character details: ");
        System.out.println("Name: "+this.name);
        System.out.println("Weapon Hitpoint: "+this.weapon.hitpoint);
        System.out.println("Weapon Level: "+this.weapon.level);
        System.out.println("Armor Durability: "+this.armor.durable);
        System.out.println("Armor Level: "+this.armor.level);
    }
}


public class Game {
    public static void main(String[] args){
        Character character = new Character();
        character.name = "Giant";
        character.weapon.hitpoint = 54;
        character.weapon.level = 2;
        character.armor.durable = "25s";
        character.armor.level = 3;
        character.display();
    }
}
