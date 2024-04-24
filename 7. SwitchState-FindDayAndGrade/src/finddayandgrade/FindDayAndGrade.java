package finddayandgrade;

import java.util.Scanner;

public class FindDayAndGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Grade Point //
//      //      //
//        System.out.println("Enter your score: ");
//        int grade = scanner.nextInt();
//        String score = "";
//        if (grade <= 32) {
//            score = "Your Result is F";
//        } else if (grade <= 39) {
//            score = "Your Result is D";
//        } else if (grade <= 49) {
//            score = "Your Result is C";
//        } else if (grade <= 59) {
//            score = "Your Result is B";
//        } else if (grade <= 69) {
//            score = "Your Result is A-";
//        } else if (grade <= 79) {
//            score = "Your Result is A";
//        } else {
//            score = "Your Result is A+";
//        }
//        
//        System.out.println(score);
//
//
//
// Find Day with number //
//      //      //
        System.out.println("Please enter Day Number: ");
        int numberOfDay = scanner.nextInt();
        String dayName = "";

        switch (numberOfDay) {
            case 1:
                dayName = "Saturday";
                break;
            case 2:
                dayName = "Sunday";
                break;
            case 3:
                dayName = "Monday";
                break;
            case 4:
                dayName = "Tuesday";
                break;
            case 5:
                dayName = "Wednesday";
                break;
            case 6:
                dayName = "Thursday";
                break;
            case 7:
                dayName = "Friday";
                break;
            default:
                dayName = "Invalid Day Number";
        }

        System.out.println(dayName);
    }

}
