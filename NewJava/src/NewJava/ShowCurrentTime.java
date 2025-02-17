package NewJava;

public class ShowCurrentTime {

  public static void main(String[] args) {
    long currentTime = System.currentTimeMillis();
    System.out.println("Current Time in MilliSeconds: " + currentTime);

    long seconds = currentTime / 1000;
    System.out.println("Current Time in Seconds: " + seconds);

    long minutes = seconds % 60;
    System.out.println("Current Time in Minutes: " + minutes);

    long hours = minutes % 60;
    System.out.println("Current Time in Hours: " + hours);

    long days = hours % 24;
    System.out.println("Current Time in Days: " + days);

    long months = days % 30;
    System.out.println("Current Time in Months: " + months);

    long years = months % 12;
    System.out.println("Current Time in Years: " + years);
  }
}