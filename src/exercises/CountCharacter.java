package exercises;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        char[] charr = sentence.toCharArray();
        int count = 0;

        for(char ch: charr){
            if(ch != ' '){
                count++;
            }
        }

        System.out.println("Number of letter or digits taken: "+count);

        sc.close();
    }
}
