package teststrings;

import java.util.Scanner;

public class TestStrings {

    public static void main(String[] args) {
//----String Class and Scanner Class - import java.util difference----        
//        String input = "Rezvi";
//        System.out.println(input);
//
//
//----Google LogIn----
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your Email ID: ");
//        String userEmail = scanner.next();
//
//        String message = String.format("Welcome Java to Gmail", (Object) args);
//
//        if (userEmail.equalsIgnoreCase("java")) {
//            
//            System.out.println("Enter your password.");
//            String password = scanner.next();
//
//            if (password.equals("Java")) {
//                System.out.println(message);
//            } else {
//                System.out.println("Incorrect Password.");
//            }
//        } else {
//            System.out.println("Can't find your Google Account.");
//        }
//
//
//
//----Facebook LogIn----
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your Email ID: ");
//        String userEmail = scanner.next();
//        System.out.println("Enter your Password ID: ");
//        String userPass = scanner.next();
//
//        String message = String.format("Welcome %s to Facebook", userEmail);
//
//        if (userEmail.equalsIgnoreCase("Java") && userPass.equals("Java")) {
//            System.out.println(message);
//        } else {
//            System.out.println("Invalid username or password.");
//        }
//
//
//
//----Shaba vi er code----Facebook LogIN----
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Username");
//        String userName = scanner.next();
//        System.out.println("Enter Your Password");
//        String password = scanner.next();
//
//        if (!userName.trim().equalsIgnoreCase("SkipKhan") || !password.equals("OMG123")) {
//            System.out.println("Wrong Credentials (Invalid Username or Password)");
//        } else if (userName.equalsIgnoreCase("SkipKhan") && password.equals("OMG123")) {
//            String message = String.format("Welcome %s", userName);
//            System.out.println(message);
//        }
//
//
//
//----Start your name with welcome----
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Name: ");
//        String name = scanner.nextLine();
//        System.out.println("Welcome, " + name);
//
//
//
//----
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Word: ");
//        String word = scanner.next();
//
//        boolean startsWithVowel = word.matches("^[aeiouAEIOU].*");
//
//        if (startsWithVowel) {
//            System.out.println(word + " is start with vowel word");
//        } else {
//            System.out.println(word + " is not start with vowel word");
//        }
//
//
//
//----Find Vowel Word----not Work----
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Word: ");
//        String word = scanner.next().toUpperCase();
//
//        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
//            System.out.println(word + " starts with a vowel.");
//        } else {
//            System.out.println(word + " start with a consonent.");
//        }
//
//
//
//----   ----
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Email ID: ");
        String userName = scanner.next();
        System.out.println("Enter your Password ID: ");
        String userPass = scanner.next();

        String message = String.format("Welcome %s to Facebook", userName);
        
        
        if(userName.length() > 3 && userName.length() <=10 ){
            System.out.println(message);
        }
        else{
            System.out.println("Invalid username or password");
        }
        
//        if (userName.equalsIgnoreCase("Java") && userPass.equals("Java")) {
//
//            if (userName.length() > 3 && userName.length() <= 10) {
//                System.out.println(message);
//            }
//        } else {
//            System.out.println("Invalid username or password");
//        }
        
        

    }

}
