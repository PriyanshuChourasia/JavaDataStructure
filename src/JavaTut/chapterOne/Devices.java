package JavaTut.chapterOne;

class Mobilephone{
    String brand;
    float price;
    int storage;

    void call(){
        System.out.println("Calling...");
    }
}

public class Devices {
    public static void main(String[] args){
        Mobilephone Iphone = new Mobilephone();
        Mobilephone Samsung = new Mobilephone();
        Iphone.brand = "IPhone";
        Iphone.price = 134000.78F;
        Iphone.storage = 64;
        Iphone.call();

        Samsung.brand = "Samsung";
        Samsung.price = 150000.F;
        Samsung.storage = 128;
        Samsung.call();
    }
}
