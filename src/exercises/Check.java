package exercises;
import java.util.*;


class Check{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to select option: ");
        System.out.println("Choose 1 to process Buzz number:");
        System.out.println("Choose 2 to process Automorphic number: ");
        int choice = sc.nextInt();


        switch (choice){
            case 1:
                System.out.println("Enter number: ");
                int num = sc.nextInt();
                int num2 = num;
                if(num % 7 == 0){
                    System.out.println("It is an Buzz number: "+num);
                    return;
                }else{
                    int sum = 0;
                    int cnt = 0;
                    while (num > 0){
                        int rem = num % 10;
                        cnt = cnt + 1;
                        if(rem == 7 && cnt == 1){
                            sum = rem;
                        }
                        num = num / 10;
                    }
                    if(sum == 7){
                        System.out.println("This number is Buzz number: "+num2);
                    }
                    else{
                        System.out.println("This number is not Buzz number: "+num2);
                    }
                }
                break;
            case 2:
                System.out.println("Enter number: ");
                int num3 = sc.nextInt();

                int num4 = num3;
                int cnt = 0;
                int sq = num3 * num3;

                while (num4 > 0){
                    cnt = cnt + 1;
                    num4 = num4 / 10;
                }

                int count = 0;
                int sum = 0;


                while (sq > 0){
                    int rem = sq % 10;
                    count = count + 1;
                    if(count <= cnt){
                        sum = sum * 10 + rem;
                    }
                    sq = sq / 10;
                }

                int rev = 0;

                while(sum > 0){
                    int rem = sum % 10;
                    rev = rev * 10 + rem;
                    sum = sum / 10;
                }

                if(rev == num3){
                    System.out.println("This is an Automorphic number: "+num3);
                }else{
                    System.out.println("This is not an Automorphic number: "+num3);
                }
                break;
            default:
                System.out.println("Wrong option selected");
                break;
        }

        sc.close();
    }
}