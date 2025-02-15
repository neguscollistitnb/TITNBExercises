package week11.section22;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DateOfBirthRecords {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1995, 5, 10, 14, 59, 30);
        System.out.println(createDOBRecords(values));
        values = Arrays.asList(2001, 10, 30, 1, 15);
        System.out.println(createDOBRecords(values));
    }

    //write your static method here. No need to add Main class or main method.
    public static LocalDateTime createDOBRecords(List<Integer> values) {
        // Ensure the list length is between 5 and 6
        if (values == null || (values.size() < 5 || values.size() > 6)) {
            return null; // Invalid list length
        }

        // Ensure all values are positive integers
        for (Integer value : values) {
            if (value == null || value < 0) {
                return null; // At least one value is negative or null
            }
        }

        // Extract values from the list
        int year = values.get(0);
        int month = values.get(1);
        int day = values.get(2);
        int hour = values.get(3);
        int minute = values.get(4);
        int second = (values.size() == 6) ? values.get(5) : 0; // Assign 0 if second is not provided

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute, second);

        return dateTime;
    }
}
