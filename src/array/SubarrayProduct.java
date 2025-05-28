package array;

import java.util.Scanner;

public class SubarrayProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        boolean success= false;
        System.out.println("Enter size: ");
        int num = sc.nextInt();

        arr = new int[num];

        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the final product: ");
        int k = sc.nextInt();

        for(int i=0; i<num; i++)
        {
            int product = 1;
            for(int j=i; j<num; j++)
            {
                product = product * arr[j];
                if(product == k){
                    success = true;
                    break;
                }
            }

        }

        if(success){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}
