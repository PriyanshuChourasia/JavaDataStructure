package exercises;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String newWord = "";

        for(String word: words){
            if(word.length() > 0){
                String capatiised = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                newWord += capatiised + " ";
            }
        }

        System.out.println(newWord);

        sc.close();
    }
}
