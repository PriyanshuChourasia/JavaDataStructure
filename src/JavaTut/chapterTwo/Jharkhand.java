package JavaTut.chapterTwo;
/*Constructor
* */

class District{

    String name;
    int pin;
    District(String name, int pin){
        this.name = name;
        this.pin = pin;
    }
    District(int pin){
        this.pin = pin;
    }

    void display(){
        System.out.println("Details: ");
        if(name != null){
            System.out.println("Name: "+this.name);
        }
        System.out.println("Pincode: "+this.pin);
    }
}

public class Jharkhand {
    public static void main(String[] args){
        District district = new District(1234456);
        district.display();
    }
}
