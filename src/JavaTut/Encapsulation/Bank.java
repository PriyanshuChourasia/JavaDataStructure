package JavaTut.Encapsulation;

import java.util.*;

class BankAccount{
    private int balance;
    private String accountHolderName;

    private int getBalance(){
        return this.balance;
    }

    private void setBalance(int balance){
        this.balance = balance;
    }

    private String getAccountHolderName(){
        return this.accountHolderName;
    }

    private void setAccountHolderName(String name){
        this.accountHolderName = name;
    }

    void createAccount(String name){
        if(name.isEmpty() || name == ""){
            System.out.println("Please enter correct name.");
            return;
        }
        this.setAccountHolderName(name);
    }

    void deposit(int money){
        if(money < 0){
            System.out.println("The amount is incorrect");
            return;
        }
        int remaningBal = getBalance();
        int currentBal = money + remaningBal;
        this.setBalance(currentBal);
        System.out.println("Account Holder name: "+this.getAccountHolderName());
        System.out.println("Balance: "+this.getBalance());
    }

    void withdraw(int money){
        if(money > this.getBalance()){
            System.out.println("You do not have sufficient balance in your account");
            return;
        }
        System.out.println("Withdrawal amount: "+money);
        int remainingBal = this.getBalance() - money;
        this.setBalance(remainingBal);
        System.out.println("Your current Balance is: "+this.getBalance());
    }
}

public class Bank {
    public static void main(String[] args){
        BankAccount arunaccount = new BankAccount();
        arunaccount.createAccount("Arun Ghosh");
        arunaccount.deposit(5678);
        arunaccount.withdraw(456);
        arunaccount.deposit(34);
    }
}
