package JavaTut.chapterOne;


class Dog{
    String name;
    String breed;
    int age;
    void bark(){
        System.out.println("Woof Woof");
    }
}


public class Animal {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "Labarator";
        dog.breed = "American";
        dog.age = 6;
        System.out.println("Name: "+dog.name);
        dog.bark();
        dog.age = 7;
        System.out.print("Age: "+dog.age);
    }
}
