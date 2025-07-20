package encryptDecrypt;

import java.util.Scanner;

public class EncryptionDecryption {

    String encrypt(String phrase, int level){
        int sum = level + 4 + 65;
        char character1 = (char) sum;
        String rephrase = "" + character1;
        for (int i=0; i<phrase.length(); i++){
            int asciival = phrase.charAt(i);
            if(asciival >= 97 && asciival <= 122){
                int temp = asciival + level;
                if(temp > 122){
                    int diff = temp - 123;
                    temp = 97 + diff;
                }
                char character = (char)temp;
                rephrase = rephrase + character;
            }
            else if(asciival >= 65 && asciival <= 90){
                int temp = asciival + level;
                if(temp > 90){
                    int diff = temp - 91;
                    temp = 65 + diff;
                }
                char character = (char) temp;
                rephrase = rephrase + character;
            }else{
                int temp = asciival + level;
                char character = (char)temp;
                rephrase = rephrase + character;
            }
        }
        return rephrase;
    }

    String decrypt(String phrase){
        char firstlevel = phrase.charAt(0);
        int level = (int)firstlevel - 69;
        String rephrase = "";
        for(int i=1; i< phrase.length() ; i++){
            int asciival = phrase.charAt(i);
            int levelascii = asciival - level;
            if(levelascii >= 97 && levelascii <= 122){
                char tempchar = (char) levelascii;
                rephrase = rephrase + tempchar;
            }
            else if(levelascii >90 && levelascii < 97){
                int temp = 97 - levelascii;
                int diff = 123 - temp;
                char tempchar = (char)diff;
                rephrase = rephrase + tempchar;
            }else if(levelascii >= 65 && levelascii <= 90){
                char tempchar = (char) levelascii;
                rephrase = rephrase + tempchar;
            }else if(levelascii < 65 && levelascii > 58){
                int temp = 65 - levelascii;
                int diff = 91 - temp;
                char tempchar = (char)diff;
                rephrase = rephrase + tempchar;
            }else{
                char tempchar = (char)levelascii;
                rephrase = rephrase + tempchar;
            }
        }
        return rephrase;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EncryptionDecryption encryptionDecryption = new EncryptionDecryption();
        System.out.println("Level of encryption should not be more than 8.");
        System.out.println("Enter the level of encryption / decryption: ");
        int level = sc.nextInt();
        if(level > 8){
            System.out.println("Level entered is greater than 8");
            return;
        }else {


            int choose;
            do {
                System.out.println("Choose to Encrypt or Decrypt: ");
                System.out.println("1. Encrypt");
                System.out.println("2. Decrypt");
                System.out.println("3. To exit process");
                choose = sc.nextInt();
                sc.nextLine();
                switch (choose) {

                    case 1:
                        System.out.println("Enter the phrase: ");
                        String phrase = sc.nextLine();
                        String encryptedText = encryptionDecryption.encrypt(phrase, level);
                        System.out.println("Encrypted text: " + encryptedText);
                        break;
                    case 2:
                        System.out.println("Enter the phrase: ");
                        String decryptphrase = sc.nextLine();
                        String decryptedtext = encryptionDecryption.decrypt(decryptphrase);
                        System.out.println("Encrypted text: " + decryptedtext);
                        break;
                    default:
                        System.out.println("You have exit the process");
                        break;
                }
            } while (choose != 3);


        }

        sc.close();
    }
}
