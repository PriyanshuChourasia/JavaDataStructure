package array;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;

        System.out.println("Enter size: ");
        int num = sc.nextInt();

        System.out.println("Enter array num: ");
        arr = new int[num];

        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        int leftsum = 0;
        int poi = -1;

        for(int i=0; i<num; i++){
            leftsum = leftsum + arr[i];

            int rightsum = 0;
            for(int j=i+1; j<num; j++)
            {
                rightsum = rightsum + arr[j];
            }

            if(leftsum == rightsum){
                poi = i+1;
                break;
            }
        }

        if(poi > 0){
            for(int i=0; i<num; i++){
                if(poi == i){
                    System.out.println("");
                }

                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println("No Subarray found");
        }



        sc.close();
    }
}
