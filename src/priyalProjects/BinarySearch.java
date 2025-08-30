package priyalProjects;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class BinarySearch {

    public boolean searchYear(int target){
        int[] years = {1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        int low = 0;
        int high = years.length - 1;

        while(low<=high){
           int mid = (low + high) / 2;
            if(years[mid] == target){
                return true;
            }
            else if(years[mid] > target){
                high = mid - 1;
            }
            else if(years[mid] < target){
                low = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();

        System.out.println("Enter Year: ");
        int target = sc.nextInt();

        boolean found = binarySearch.searchYear(target);

        if(found){
            System.out.println("Record found");
        }else{
            System.out.println("Record not found");
        }

        sc.close();
    }
}
