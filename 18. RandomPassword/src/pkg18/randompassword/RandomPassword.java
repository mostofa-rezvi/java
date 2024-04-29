package pkg18.randompassword;

//import java.util.Random;

public class RandomPassword {

    public static void main(String[] args) {
        int password = (int)Math.floor(Math.random()*10);
        System.out.println(password);
    }

//    public static String RandomPassword(int length) {
//        
//    }
    
   
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        int length = 4;
//        
//        System.out.println(RandomPassword(length));
//    }
//
//    public static String RandomPassword(int length) {
//        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
//
//        Random random = new Random();
//        char[] password = new char[length];
//        for (int i = 0; i < length; i++) {
//            password[i] = chars[random.nextInt(chars.length)];
//        }
//        return new String(password);
//    }
}

