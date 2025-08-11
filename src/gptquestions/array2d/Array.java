package gptquestions.array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public int[] searchIn2D(int[][] matrix, int target,int rows,int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,1};
    }

    public static void main(String[] args){
        Array array = new Array();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        System.out.println("Enter numbers: ");

        int[][] arr = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target element: ");

        int target = sc.nextInt();

        int[] indexFound = array.searchIn2D(arr,target,rows,cols);

        System.out.println("Indexes are: "+ Arrays.toString(indexFound));

        sc.close();
    }
}
