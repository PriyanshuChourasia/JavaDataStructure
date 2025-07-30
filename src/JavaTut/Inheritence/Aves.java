package JavaTut.Inheritence;

class Bird{
    void fly(){
        System.out.println("Bird is flying..");
    }
}

class Parrot extends Bird{
    void talk(){
        System.out.println("Parrot is talking..");
    }
}





public class Aves {
    public static void main(String[] args){
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.talk();
    }
}
