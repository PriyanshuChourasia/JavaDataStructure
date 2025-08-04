package gptquestions.linearSearch;


import java.util.Scanner;

public class FindElement {

    public int findElement(int[] nums, int num){
        for(int i=0; i<nums.length; i++){
            if(num == nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        FindElement findElement = new FindElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] linearArr = new int[size];
        System.out.println("Enter number: ");
        for(int i=0; i<size; i++){
            linearArr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int search = sc.nextInt();
        int index = findElement.findElement(linearArr,search);

        System.out.println("Element found at index: "+index);

        sc.close();
    }
}
