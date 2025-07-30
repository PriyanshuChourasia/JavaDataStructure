package JavaTut.Inheritence;


class BankAccount{
    void checkBalance(){
        System.out.println("Checking balance.....");
    }
}

class SavingsAccount extends BankAccount{
    void addInterest(){
        System.out.println("Adding interest");
    }
}

public class Bank {
    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.checkBalance();
        savingsAccount.addInterest();
    }
}
