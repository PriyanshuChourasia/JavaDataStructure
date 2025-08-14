package dataStructure.subarrays;

import java.util.Scanner;

public class AllSubArray {

    public void printAllSubArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                for(int k=i; k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args){
        AllSubArray allSubArray = new AllSubArray();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int num = sc.nextInt();

        int[] nums = new int[num];

        System.out.println("Enter numbers: ");
        for (int i=0; i<num; i++){
            nums[i] = sc.nextInt();
        }
        allSubArray.printAllSubArray(nums);

        sc.close();
    }
}
