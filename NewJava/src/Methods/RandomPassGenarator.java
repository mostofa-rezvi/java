package Methods;

import java.util.Random;
import java.util.Scanner;

public class RandomPassGenarator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Password Length: ");

    int passwordLength = scanner.nextInt();

    String password = passGenarator(passwordLength);
    System.out.println("Password is " + password);

    scanner.close();
  }

  public static String passGenarator(int passwordLength) {
    Random random = new Random();
    String password = "";
    String finalPassword = "";

    for (int i = 1; i <= passwordLength; i++) {
      int range = random.nextInt(3) + 1;

      switch (range) {
        case 1:
          password += (char) (random.nextInt(26) + 65);
          break;
        case 2:
          password += (char) (random.nextInt(26) + 97);
          break;
        case 3:
          password += (char) (random.nextInt(10) + 48);
          break;
      }
    }

    for (int i = 0; i < password.length(); i++) {
      if (i == password.length() / 2) {
        finalPassword += "_" + password.charAt(i);
      } else {
        finalPassword += password.charAt(i);
      }
    }

    return finalPassword;
  }

}
