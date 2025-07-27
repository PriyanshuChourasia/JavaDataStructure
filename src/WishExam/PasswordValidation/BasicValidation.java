package WishExam.PasswordValidation;

import java.util.*;


class PasswordManager{
    void displayRules(){
        System.out.println("At least 8 characters");
        System.out.println("At least one uppercase letter");
        System.out.println("At least one lowercase letter");
        System.out.println("At least one digit");
        System.out.println("Must not contain whitespace");
        System.out.println("Must not contain more than two identical characters in a row (e.g., 'aaa' is invalid)");
        System.out.println("Must not contain disallowed or unsafe characters: <, >, ;, =, `, ~, \", \\, '");
    }

    void lengthRule(){
        System.out.println("At least 8 characters");
    }

    void upperCaseRule(){
        System.out.println("At least one uppercase letter");
    }

    void lowerCaseRule(){
        System.out.println("At least one lowercase letter");
    }

    void oneDigitRule(){
        System.out.println("At least one digit");
    }
    void containsWhiteSpaceRule(){
        System.out.println("Must not contain whitespace");
    }

    void identicalRule(){
        System.out.println("Must not contain more than two identical characters in a row (e.g., 'aaa' is invalid)");
    }

    void unsafeRule(){
        System.out.println("Must not contain disallowed or unsafe characters: <, >, ;, =, `, ~, \", \\, '");
    }

    void allowedCharsLimitExceed(){
        System.out.println("At least one special character Allowed: @, #, $, %, ^, &, +,");
        System.out.println("Allowed one Characters limit exceeds");
    }

    void emailRule(){
        System.out.println("No email patterns are allowed");
    }

    void websiteRule(){
        System.out.println("No Domain patters are required");
    }

    void dictionaryRule(){
        System.out.println("No dictionary word allowed");
    }

    void socialMediaRule(){
        System.out.println("Social Media names not allowed");
    }

    void NumericIpPatternRule(){
        System.out.println("No numeric IP pattern rule is allowed");
    }
}

class BasicPasswordManager extends PasswordManager{

    boolean checkBasic(String password){
        if(password.length() > 8 ){
            if(this.checkForOneUpperCase(password)){
                if(this.checkForOneLowerCase(password)){
                    if(this.checkForOneDigit(password)){
                        if(this.checkForWhiteSpace(password)){
                            if(this.checkidenticalCharacters(password)){
                                if(this.checkForDiallowedCharacter(password)){
                                    return true;
                                }else{
                                    unsafeRule();
                                    return false;
                                }
                            }
                            else{
                                identicalRule();
                                return false;
                            }
                        }else {
                            containsWhiteSpaceRule();
                            return false;
                        }
                    }else{
                        oneDigitRule();
                        return false;
                    }
                }else{
                    lowerCaseRule();
                    return false;
                }
            }else {
                upperCaseRule();
                return false;
            }
        }else{
            lengthRule();
            return false;
        }
    }

    boolean checkForOneUpperCase(String msg){
        int cnt = 0;
        for(int i=0; i<msg.length(); i++){
            int charval = (int)msg.charAt(i);
            if(charval > 64 && charval < 90){
                cnt++;
                break;
            }
        }
        if(cnt > 0){
            return true;
        }else{
            return false;
        }
    }

    boolean checkForOneLowerCase(String msg){
        int cnt = 0;
        for(int i=0; i<msg.length(); i++){
            int charval = (int)msg.charAt(i);
            if(charval > 96 && charval < 123){
                cnt++;
                break;
            }
        }
        if(cnt > 0){
            return true;
        }else{
            return false;
        }
    }

    boolean checkForOneDigit(String msg){
        int cnt = 0;
        for(int i=0; i<msg.length(); i++){
            if(msg.charAt(i) > '0' && msg.charAt(i) <= '9' ){
                cnt++;
                break;
            }
        }
        if(cnt > 0){
            return true;
        }else{
            return false;
        }
    }

    boolean checkForWhiteSpace(String msg){
        int cnt = 0;
        for(int i=0; i<msg.length(); i++){
            int val = (int) msg.charAt(i);
            if(val == 32){
                cnt++;
                break;
            }
        }
        if(cnt > 0){
            return false;
        }else{
            return true;
        }
    }

    boolean checkidenticalCharacters(String msg){
        int cnt=0;
        for(int i=0; i<msg.length(); i++){
            if(msg.length() - i > 2){
                if(msg.charAt(i) == msg.charAt(i+1) && msg.charAt(i) == msg.charAt(i+2)){
                    cnt++;
                    break;
                }
            }
        }

        if(cnt > 0){
            return false;
        }else {
            return true;
        }
    }

    boolean checkForDiallowedCharacter(String msg){
        String chars = "<, >, ;, =, `, ~, \", \\, '";
        int cnt=0;
        for(int i=0; i<msg.length(); i++){
            for(int j=0; j<chars.length(); j++){
                if(msg.charAt(i) == chars.charAt(j)){
                    cnt++;
                    break;
                }
            }
        }
        if(cnt > 0){
            return false;
        }else {
            return true;
        }
    }
}

class AdvancePasswordManager extends BasicPasswordManager{
    String allowedChars = "@, #, $, %, ^, &, +,";
    int score = 0;
    void passwordCheck(String password){
        if(checkBasic(password)){
            score = score + 7;
            if(this.checkFoAllowedPassword(password)){
                score = score + 2;
                if(!this.checkEmailPatterns(password))
                {
                    if(!this.checkEmailPatterns(password)){
                        score = score + 1;
                        if(!this.websitePattern(password)){
                            score = score + 1;
                            if(!this.dictionaryWord(password)){
                                if(!this.checkForSocialMedia(password)){
                                    if(!this.checkForDotPattern(password)){
                                        score = score + 1;
                                    }else{
                                        NumericIpPatternRule();
                                    }
                                }else{
                                    socialMediaRule();
                                }
                            }else{
                                dictionaryRule();
                            }
                        }else{
                            websiteRule();
                        }
                    }else{
                        emailRule();
                    }
                }else{
                    emailRule();
                }
            }else{
                allowedCharsLimitExceed();
            }
        }else{
            System.out.println("Your password is not safe: "+password);
        }
    }

    boolean checkFoAllowedPassword(String msg){
        int cnt=0;
        boolean found = false;
        for(int i=0; i<allowedChars.length(); i++){
            for(int j=0; j<msg.length(); j++){
                if(allowedChars.charAt(i) == msg.charAt(j)){
                    cnt++;
                }
            }
            if(cnt>1){
                found = true;
                break;
            }else{
                continue;
            }
        }

        if(found){
            return false;
        }else {
            this.containMoreSpecialChars(msg);
            return true;
        }
    }

    void containMoreSpecialChars(String msg){
        int cnt=0;
        int foundMore = 0;
        boolean found = false;
        for(int i=0; i<allowedChars.length(); i++){
            for(int j=0; j<msg.length(); j++){
                if(allowedChars.charAt(i) == msg.charAt(j)){
                    cnt++;
                    foundMore++;
                }
            }
            if(cnt>1){
                found = true;
                break;
            }else{
                continue;
            }
        }
        if(foundMore > 1){
            score = score + 1;
        }
    }



    boolean checkEmailPatterns(String password){
        String[] texts = password.split("@");
        if(texts.length < 2){
            return false;
        }
        String mailPat = texts[1];
        boolean found = false;
        for(int i=0; i<mailPat.length() - 1; i++){
            if(mailPat.charAt(i) == '.'){
                found = true;
                break;
            }
        }
        if(found){
            return true;
        }
        else{
            return false;
        }
    }

    boolean websitePattern(String password){
        int cnt=0;
        boolean found = false;
        for(int i=0; i<password.length(); i++){
            if(password.charAt(i) == ':'){
                for(int j=0; j<password.length(); j++){
                    if(password.charAt(j) == '/'){
                        cnt++;
                    }
                }
                if(cnt > 1){
                    found = true;
                    break;
                }
            }
        }

        if(found){
            return true;
        }else{
            return false;
        }
    }

    boolean checkForSocialMedia(String password){
        int cnt =0;
        String[] socialMedia = {"facebook", "twitter", "instagram", "linkedin", "youtube", "google"};
        for(int i=0; i<socialMedia.length; i++){
            if(password == (socialMedia[i])){
                cnt++;
                break;
            }
        }
        if (cnt > 0){
            return true;
        }else{
            return false;
        }
    }

    boolean dictionaryWord(String password){
        int cnt = 0;
        String[] dict = {"password","p@ssw0rd123", "P@ssw0rd123", "admin", "welcome", "qwerty", "abc123", "letmein", "iloveyou", "123456", "test", "default", "login", "user", "root", "admin", "root", "localhost", "system32", "cmd", "config"};
        for(int i=0; i<dict.length; i++){
            if(password == (dict[i])){
                cnt++;
                break;
            }
        }
        if (cnt > 0){
            return true;
        }else{
            return false;
        }
    }

    boolean checkForDotPattern(String password){
        int cnt = 0;
        for(int i=0; i<password.length(); i++){
            if(password.charAt(i) == '.'){
                cnt++;
            }
        }
        if(cnt > 2){
            return true;
        }else{
            return false;
        }
    }

    void scoreCheck(){
        if(score >= 7 && score <= 9){
            System.out.println("Moderate");
        }else if (score >= 10 && score <= 12){
            System.out.println("Strong");
        }else if(score > 12){
            System.out.println("Very Strong");
        }
    }
}


public class BasicValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Password Manager");
        System.out.println("Check your passwords strength");
        AdvancePasswordManager advancePasswordManager = new AdvancePasswordManager();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        advancePasswordManager.passwordCheck(password);
        advancePasswordManager.scoreCheck();
        int ans = 0;
        do {
            System.out.println("Do you want to check your password again");
            System.out.println("1. yes");
            System.out.println("0. no");
            ans = sc.nextInt();
            System.out.println("Enter password: ");
            sc.nextLine();
            String newPass = sc.nextLine();
            advancePasswordManager.passwordCheck(newPass);
            advancePasswordManager.scoreCheck();

        }while (ans != 0);


        sc.close();
    }
}
