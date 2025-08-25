package array;

public class AuxiliaryArray {


    public void createArray(int[] arr,int ind){
        int size = arr.length * 2;
        int[] brr = new int[size];
        for(int i=0; i<arr.length ; i++){
            brr[i] = brr[arr.length + i] = arr[i];
        }

        for(int j=ind; j<arr.length + ind; j++){
            System.out.println(brr[j]);
        }

    }


    public static void main(String[] args){
        AuxiliaryArray array = new AuxiliaryArray();
        int[] newArr = {1,2,3,4,5,6};
        array.createArray(newArr,3);

    }
}
