package gptquestions.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInteger {

    public void findInteger(int target, ArrayList<Integer> arrayList){
        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i) == target){
                System.out.println("Element found");
                break;
            }
        }
    }

    public static void main(String[] args){
        SearchInteger searchInteger = new SearchInteger();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Add numbers in list");

        System.out.println("Enter the size");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            arrayList.add(sc.nextInt());
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        searchInteger.findInteger(target,arrayList);


        sc.close();
    }
}
