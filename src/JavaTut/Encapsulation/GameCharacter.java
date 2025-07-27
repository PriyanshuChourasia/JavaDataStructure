package JavaTut.Encapsulation;


class Character{
    private String name;
    private int level;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        if(level < 0){
            System.out.println("Oops that's a negative level please do upgrade it.");
            return;
        }
        this.level = level;
    }
}


public class GameCharacter {
    public static void main(String[] args){
        Character hatim = new Character();
        hatim.setName("Hatim Tai");
        hatim.setLevel(12);
    }
}
