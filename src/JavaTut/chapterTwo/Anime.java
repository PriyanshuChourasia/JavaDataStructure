package JavaTut.chapterTwo;

class Character{
    String name;
    Character(String name){
        this.name = name;
    }
}


public class Anime {
    public static void main(String[] args){
        Character character = new Character("Heroku");
        Character character1 = new Character("Zeroku");
        Character character2 = new Character("Geroku");
    }
}
