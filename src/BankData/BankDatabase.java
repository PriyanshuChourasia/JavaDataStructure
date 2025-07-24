package BankData;


import java.util.Scanner;

public class BankDatabase {

    class Bank{
        String name;
        String IFSC;
        String Location;
        Bank next;
        Bank(String name,String IFSC, String Location){
            this.name = name;
            this.IFSC = IFSC;
            this.Location = Location;
            this.next = null;
        }
    }

    Bank head = null;

    void insertBankDetail(String name, String ifsc, String location){
        Bank bank = new Bank(name,ifsc,location);
        bank.next = head;
        head = bank;
    }

    void searchBankIFSC(String ifsc){
        if(head == null){
            System.out.println("Database is empty");
            return;
        }
        Bank temp = head;

        boolean found = false;

        while (temp != null){
            if(temp.IFSC.equalsIgnoreCase(ifsc)){
                found = true;
                break;
            }
            temp = temp.next;
        }

        if(found){
            System.out.println("Branch Name: "+temp.name);
            System.out.println("Branch Location: "+temp.Location);
        }else{
            System.out.println("Branch not found");
        }

    }

    void diplayBanks(){
        if(head == null){
            System.out.println("Database is empty");
            return;
        }

        Bank tmp = head;

        System.out.println("Bank Details");
        while (tmp != null){
            System.out.println("Branch Name: "+ tmp.name);
            System.out.println("IFSC:"+ tmp.IFSC);
            System.out.println("Location: "+ tmp.Location);
            System.out.println(" ");
            tmp = tmp.next;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BankDatabase bankDatabase = new BankDatabase();

        bankDatabase.insertBankDetail("SBI23","12345678901","Chas");
        bankDatabase.insertBankDetail("SBI28","12345678902","Dumka");
        bankDatabase.insertBankDetail("SBI32","12345678903","Bokaro");
        bankDatabase.insertBankDetail("SBI31","12345678905","Dhanbad");
        bankDatabase.insertBankDetail("SBI21","12345678906","Sector V Bokaro");

        System.out.println("Enter IFSC number to find branch name: ");
        String Ifsc = sc.nextLine();

        bankDatabase.searchBankIFSC(Ifsc);

    }
}
