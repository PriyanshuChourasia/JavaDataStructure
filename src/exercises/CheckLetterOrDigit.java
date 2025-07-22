package exercises;

import java.util.Scanner;

public class CheckLetterOrDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("It is a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is neither a letter nor a digit.");
        }

        sc.close();
    }
}
