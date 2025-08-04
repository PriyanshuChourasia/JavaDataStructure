package gptquestions.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindOccurence {

    public int[] findAllOccur(int[] nums, int num){
        int a = 0;
        String number = "";
        for(int i=0; i<nums.length; i++){
            if(nums[i] == num){
                number = number + i;
                a++;
            }
        }
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = number.charAt(i) - '0';
        }
        return arr;
    }

    public static void main(String[] args){
        FindOccurence findOccurence = new FindOccurence();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to find: ");
        int num = sc.nextInt();
        int[] eles = findOccurence.findAllOccur(arr,num);
        if(eles == null){
            System.out.println("Not found");
        }else {
            System.out.println(Arrays.toString(eles));
        }

        sc.close();
    }
}
