package JavaTut.chapterOne;

class Account{
    String name;
    float balance;

    private void printBalance(float amount){
        System.out.println("Amount: "+amount);
    }

    void deposit(float amount){
        this.balance = this.balance + amount;
        System.out.println("Your money has been deposited");
        printBalance(this.balance);
    }

    void withdraw(float amount){
        if(amount > this.balance){
            System.out.println("You do not have sufficient balance");
            printBalance(this.balance);
            return;
        }
        this.balance = this.balance - amount;
        System.out.println("Money has been withdrawn");
        printBalance(this.balance);
    }
}


public class Bank {
    public static void main(String[] args){
        Account acc = new Account();

        acc.name = "Priyanshu";
        acc.balance = 500;
        acc.deposit(200);
        acc.withdraw(200);
        acc.withdraw(1000);
        acc.deposit(2000);
    }
}
