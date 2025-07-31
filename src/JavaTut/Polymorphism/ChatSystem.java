package JavaTut.Polymorphism;

class MessageSender{
    void sendMessage(User user){
        user.receiveMessage();
    }
}

abstract class User{
    abstract void receiveMessage();
}

class Admin extends User{
    void receiveMessage(){
        System.out.println("Admin receive message system alert!");
    }
}

class Customer extends User{
    void receiveMessage(){
        System.out.println("Customer receive message order alert!");
    }
}


public class ChatSystem {
    public static void main(String[] args){
        MessageSender sender = new MessageSender();
        sender.sendMessage(new Admin());
        sender.sendMessage(new Customer());
    }
}
