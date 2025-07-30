package JavaTut.Inheritence;

class Game{
    public String name = "Clash of Clans";
    public String OwnedBy = "Raju Games";

    void gameDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Owned By: "+this.OwnedBy);
    }
}

class Character extends Game{
    public String charName;
    public int level;
    public String specialPower;

    public String getCharName(){
        return this.charName;
    }

    public void setCharName(String charName){
        this.charName = charName;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public String getSpecialPower(){
        return this.specialPower;
    }

    public void setSpecialPower(String specialPower){
        this.specialPower = specialPower;
    }

    void characterDetail(){
        System.out.println("Character Name: "+this.getCharName());
        System.out.println("Character Level: "+this.getLevel());
        System.out.println("Character Special Power: "+this.getSpecialPower());

    }

}



public class GameBoard {
    public static void main(String[] args){
        Character mage = new Character();
        Character archer = new Character();
        Character warrior = new Character();

        mage.setCharName("Mage Mini");
        mage.setLevel(12);
        mage.setSpecialPower("Punch");
        mage.gameDetails();
        mage.characterDetail();

        archer.setCharName("Mary the Archer");
        archer.setLevel(6);
        archer.setSpecialPower("Potion");
        archer.gameDetails();
        archer.characterDetail();

        warrior.setCharName("Priyanshu The Warrior");
        warrior.setLevel(25);
        warrior.setSpecialPower("Imagination");
        warrior.gameDetails();
        warrior.characterDetail();
    }
}
