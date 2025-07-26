package JavaTut.chapterOne.ObjectComposition;


class GameArmor{
    String durable;
    int level;
}

class GameCharacter{
    String name;
    GameArmor gameArmor;

    void display(){
        System.out.println("Character Details: ");
        System.out.println("Name: "+this.name);
        System.out.println("Armor Durability: "+this.gameArmor.durable);
        System.out.println("Armor Level: "+this.gameArmor.level);

        System.out.println("------------------------------------------");
    }
}


public class GamePlay {
    public static void main(String[] args){
        GameArmor gameArmor = new GameArmor();
        GameCharacter g1 = new GameCharacter();
        GameCharacter g2 = new GameCharacter();
        gameArmor.durable = "34s";
        gameArmor.level = 23;

        g1.name = "Swordsman";
        g1.gameArmor = gameArmor;

        g2.name = "Giant";
        g2.gameArmor = gameArmor;

        g1.display();
        g2.display();

        g1.gameArmor.durable = "32s";
        g1.display();
        g2.display();

    }
}
