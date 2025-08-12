package gptquestions.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class NameBook {

    public ArrayList<String> removeName(ArrayList<String> names, String target ){
        boolean found = false;
        for(int i=0; i<names.size(); i++){
            if(names.get(i).equalsIgnoreCase(target)){
                names.remove(i);
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Name is found and removed");
        }else{
            System.out.println("Name is not found");
        }
        return names;
    }


    public static void main(String[] args){
        NameBook nameBook = new NameBook();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int ans;
        do {


            System.out.println("Enter name: ");
            String name = sc.nextLine();
            names.add(name);

           System.out.println("Do you want to take name: ");
           System.out.println("1. Yes : 0. No");
            ans = sc.nextInt();
            sc.nextLine();
        }while (ans != 0);

        System.out.println("Enter target: ");
        String target = sc.nextLine();

        ArrayList<String> updatedList =  nameBook.removeName(names,target);

        System.out.println(updatedList);

        sc.close();
    }
}
