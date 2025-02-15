package week11.section22;

import java.util.LinkedHashMap;
import java.util.Map;

public class DifferenceBetweenTwoDates {

    //write your static method here. No need to add Main class or main method.
    public static Map<String, Integer> getTimeDifference(Map<String, Integer> firstDateTime, Map<String, Integer> secondDateTime){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int yearDiff = secondDateTime.get("year") - firstDateTime.get("year");
        int monthDiff = secondDateTime.get("month") - firstDateTime.get("month");
        int dayDiff = secondDateTime.get("day") - firstDateTime.get("day");
        int hourDiff = secondDateTime.get("hour") - firstDateTime.get("hour");
        int minuteDiff = secondDateTime.get("minute") - firstDateTime.get("minute");
        int secondDiff = secondDateTime.get("second") - firstDateTime.get("second");

        // Adjust for negative differences
        if (secondDiff < 0) {
            secondDiff += 60;
            minuteDiff--;
        }
        if (minuteDiff < 0) {
            minuteDiff += 60;
            hourDiff--;
        }
        if (hourDiff < 0) {
            hourDiff += 24;
            dayDiff--;
        }
        if (dayDiff < 0) {
            monthDiff--;
            if (monthDiff < 0) {
                monthDiff += 12;
                yearDiff--;
            }
            dayDiff += daysInMonth[firstDateTime.get("months") - 1];
        }
        if (monthDiff < 0) {
            monthDiff += 12;
            yearDiff--;
        }

        Map<String, Integer> difference = new LinkedHashMap<>();

        if (yearDiff == 0 && monthDiff == 0 && dayDiff == 0 &&
                hourDiff == 0 && minuteDiff == 0 && secondDiff == 0){
            return difference;
        }

        difference.put("years", Math.abs(yearDiff));
        difference.put("months", monthDiff);
        difference.put("days", dayDiff);
        difference.put("hours", hourDiff);
        difference.put("minutes", minuteDiff);
        difference.put("seconds", secondDiff);


        return difference;
    }




    public static void main(String[] args) {
        // Example usage
            Map<String, Integer> date1 = Map.of(
                    "year", 1995, "month", 5, "day", 10,
                    "hour", 14, "minute", 59, "second", 30
            );

            Map<String, Integer> date2 = Map.of(
                    "year", 2000, "month", 1, "day", 15,
                    "hour", 19, "minute", 25, "second", 30
            );

        Map<String, Integer> date3 = Map.of(
                "year", 2020, "month", 1, "day", 15,
                "hour", 19, "minute", 25, "second", 30
        );

        Map<String, Integer> date4 = Map.of(
                "year", 0, "month", 12, "day", 30,
                "hour", 23, "minute", 00, "second", 59
        );

        System.out.println(getTimeDifference(date1 , date2));
        System.out.println(getTimeDifference(date3 , date4));

    }
}
