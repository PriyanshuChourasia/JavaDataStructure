package TimeComplexity;

import java.util.Scanner;

public class TimeOne {

    public int firstApproach(int[] arr){
        int max = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]< arr[j]){
                    max = arr[j];
                }
            }
        }
        return max;
    }

    public int secondApproach(int[] arr){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TimeOne timeOne = new TimeOne();

        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] numarr = new int[size];

        System.out.println("Enter array numbers: ");
        for(int i=0; i<size; i++){
            numarr[i] = sc.nextInt();
        }

        int max = timeOne.firstApproach(numarr);
        System.out.println("The maximum number with first approach: "+max);

        int secondMax = timeOne.secondApproach(numarr);
        System.out.println("The maximum number with second approach: "+secondMax);
        sc.close();
    }
}
