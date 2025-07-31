package JavaTut.Polymorphism;

abstract class Fighter{
    abstract void attack();
}

class Ninja extends Fighter{
    void attack(){
        System.out.println("Ninja throws shuriken");
    }
}

class Samurai extends Fighter{
    void attack(){
        System.out.println("Samurai slashes with sword");
    }
}

class Knight extends Fighter{
    void attack(){
        System.out.println("Knight charges with lance!");
    }
}



public class Arena {
    public static void main(String[] args){
        Fighter[] fighters = {
                new Ninja(),
                new Samurai(),
                new Knight()
        };

        for(Fighter f: fighters){
            f.attack();
        }
    }
}
