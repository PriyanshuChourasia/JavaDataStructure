package gptquestions.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTable {

    public void searchUserByName(String name, ArrayList<String> arrayList){

        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(0).equalsIgnoreCase(name)){
                System.out.println("User found");
                break;
            }
        }
    }
    public static void main(String[] args){
        UserTable userTable = new UserTable();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("User Database");

        for(int i=0; i<5; i++){
            String name = sc.nextLine();
            arrayList.add(name);
        }

        System.out.println(arrayList.get(3));

        System.out.println("Search By Name");
        String searchName = sc.nextLine();

        userTable.searchUserByName(searchName,arrayList);

        sc.close();
    }
}
