public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes>=0){
            long hours=(int)minutes/60;
            long remainingMinutes=(int)minutes%60;
            long day=(int)hours/24;
            long remainingHours=(int)hours%24;
            long year=(int)day/365;
            long ramainingDay=(int)day%365;
            System.out.println(minutes+" min = "+year+" y and "+ramainingDay+" d");
        } else{
            System.out.println("Invalid value");
        }
    }
}
