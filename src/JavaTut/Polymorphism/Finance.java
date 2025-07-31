package JavaTut.Polymorphism;

class Payment{
    void pay(){
        System.out.println("Payment.....");
    }
}

class UPIPayment extends Payment{
    @Override
    void pay(){
        System.out.println("UPI payment....");
    }
}

class CreditCardPayment extends Payment{
    void pay(){
        System.out.println("Credit Card payment....");
    }
}

class CashPayment extends Payment{
    void pay(){
        System.out.println("Cash payment....");
    }
}


public class Finance {
    public static void main(String[] args){
        Payment upi = new UPIPayment();
        upi.pay();
        Payment credit = new CreditCardPayment();
        credit.pay();
        Payment cash = new CashPayment();
        cash.pay();
    }
}
