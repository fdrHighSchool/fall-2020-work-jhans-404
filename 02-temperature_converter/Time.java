public class Time {
  public static void main(String[] args) {
    /*
    //create variables named hour, minute, and second.
    int hour = 12;
    int minute = 0;
    int second = 0;

    int elapsedSeconds = secondsSinceMidnight(hour, minute, second);

    //use the method we created to find how many seconds are in a day
    int dailySeconds = secondsSinceMidnight(24, 0, 0);

    //calculate and display the number of seconds remaining in the day
    int remainingSeconds = dailySeconds - elapsedSeconds;
    System.out.println("Remaining seconds in the day: " + remainingSeconds);

    //calculate and display the percentage of the day that has passed
    // 5/2 = 2
    // 10/2 = 5
    double percentage = 1.0 * elapsedSeconds / dailySeconds * 100;
    System.out.println("Percent of day gone by: " + percentage);
    */

    System.out.println("Adding tests:");
    addTime(1, 10, 30, 1, 25, 15);
    addTime(1, 10, 30, 1, 55, 50);
    addTime(1, 10, 30, 0, 113, 20);

    System.out.println("\nBetween tests:");
    timeBetween(2, 35, 45, 1, 25, 15);
    timeBetween(3, 6, 20, 1, 55, 50);
    timeBetween(3, 3, 50, 0, 113, 20);

  }//end main method

  //calculate and return the number of seconds since midnight.
  public static int secondsSinceMidnight(int h, int m, int s) {
    int totalSeconds = 0;

    totalSeconds += s;
    totalSeconds += m * 60;
    totalSeconds += h * 60 * 60;

    //System.out.println(totalSeconds);//can print out to screen to debug
    return totalSeconds;
  }//end secondsSinceMidnight method


  //this method takes in two times (current and amount to add)
  //and outputs the result; imagine the knowing the start-time of a movie
  //and how long it is...when will it end?
  public static void addTime(int h1, int m1, int s1, int h2, int m2, int s2) {
    int seconds1 = secondsSinceMidnight(h1, m1, s1);
    int seconds2 = secondsSinceMidnight(h2, m2, s2);

    int totalSeconds = seconds1 + seconds2;

    int finalHours = totalSeconds / 3600;
    totalSeconds %= 3600;
    int finalMins = totalSeconds / 60;
    int finalSeconds = totalSeconds % 60;

    System.out.printf("%02d:%02d:%02d\n", finalHours, finalMins, finalSeconds);

  }//end addTime method


  //this method takes in two times (current and amount to add
  //and outputs the result; imagine the knowing the start-time and end-time
  //of a movie...how long it is the movie?
  public static void timeBetween(int h1, int m1, int s1, int h2, int m2, int s2) {
    int seconds1 = secondsSinceMidnight(h1, m1, s1);
    int seconds2 = secondsSinceMidnight(h2, m2, s2);

    int secondsBetween = seconds1 - seconds2;

    int finalHours = secondsBetween / 3600;
    secondsBetween %= 3600;
    int finalMins = secondsBetween / 60;
    int finalSeconds = secondsBetween % 60;

    System.out.printf("%02d:%02d:%02d\n", finalHours, finalMins, finalSeconds);

  }//end timeBetween method


}//end class
