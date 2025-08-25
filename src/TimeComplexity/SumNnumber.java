package TimeComplexity;

import java.util.Scanner;

public class SumNnumber {

    public int firstApproach(int n){
        int sum =0;
        for (int i=0; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public int secondApproach(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SumNnumber sumNnumber = new SumNnumber();

        System.out.println("Enter num: ");
        int size = sc.nextInt();

        int sum = sumNnumber.firstApproach(size);
        System.out.println("The first approach sum: "+sum);
        int sumsec = sumNnumber.secondApproach(size);
        System.out.println("The second approach sum: "+sumsec);

        sc.close();
    }
}
