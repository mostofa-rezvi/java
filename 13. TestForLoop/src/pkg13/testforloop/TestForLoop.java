package pkg13.testforloop;

import java.util.Scanner;

public class TestForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start Value: ");
        int startValue = scanner.nextInt();
        System.out.println("Enter End Value: ");
        int endValue = scanner.nextInt();

        int count = 0;

        for (int number = endValue; number <= endValue; endValue++) {
            for (startValue = 1; startValue <= endValue; startValue++) {

                if (endValue % startValue == 0) {
                    count++;// count=1 count=2
                }
            }
        }
        if (count == 2) {
            System.out.println(endValue);
        }


    }

}

}
