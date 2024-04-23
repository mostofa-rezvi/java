
package showcurrenttime;

//import java.util.Date;


public class ShowCurrentTime {


    public static void main(String[] args) {
       
//        Date day = new Date();
//        System.out.println("Current date is " + day);

        long totalMilliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMilliseconds / 1000;
        
        long currentSeconds = totalSeconds % 60;
        //
        long totalMinutes = totalSeconds / 60;
        
        long currentMinutes = totalMinutes % 60;
        //
        long totalHours = totalMinutes / 60;
        
        long currentHours = totalHours % 24;
        
        System.out.println("Current time is " + currentHours + ":" + currentMinutes+ ":" + currentSeconds);
        
        
    }
    
}
