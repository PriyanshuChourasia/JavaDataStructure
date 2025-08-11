package gptquestions.array2d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllIn2d {

    public List<int[]> findAllOccurences(int[][] matrix, int target, int rows, int cols){
        List<int[]> positions = new ArrayList<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == target){
                    positions.add(new int[]{i,j});
                }
            }
        }
        return positions;
    }


    public static void main(String[] args){
        FindAllIn2d findAllIn2d = new FindAllIn2d();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter matrix values: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();


        List<int[]> results = findAllIn2d.findAllOccurences(arr,target,rows,cols);

        if(results.isEmpty()){
            System.out.println("No elements found");
            return;
        }else{
            System.out.println("Element found at positions: ");
            for(int[] pos: results){
                System.out.println("("+ pos[0] + "," + pos[1]+ ")");
            }
        }

        sc.close();
    }
}
