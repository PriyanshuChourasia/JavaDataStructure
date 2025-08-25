package TimeComplexity;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String message = sc.nextLine();

        String reverseMessage = "";
        for(int i=message.length() - 1; i>=0; i--){
            reverseMessage = reverseMessage + message.charAt(i);
        }

        System.out.println("Reverse String message: "+reverseMessage);

        sc.close();

    }
}
