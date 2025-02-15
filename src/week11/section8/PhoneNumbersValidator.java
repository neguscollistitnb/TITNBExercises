package week11.section8;

import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneNumbersValidator {
    public static void main(String[] args) {
        String phoneNumbers = "023-456-7890, 555-5555, 0876543210, 0123456789";
        System.out.println(validatePhoneNumbers(phoneNumbers));

        phoneNumbers = "123-456-7890, 555-5555, 9876543210, 0123456789";
        System.out.println(validatePhoneNumbers(phoneNumbers));
    }

    public static Map<String, String> validatePhoneNumbers(String input) {
        String[] allPhoneNumbers = input.split("[,\\s]+");
        Map<String,String> results = new LinkedHashMap<>();

        for (int i = 0; i < allPhoneNumbers.length; i++){
            if (allPhoneNumbers[i].replace("-" , "").length() == 10 && allPhoneNumbers[i].startsWith("0") && allPhoneNumbers[i].charAt(9) != '9'){
                results.put(allPhoneNumbers[i] , String.valueOf(i));
            }
        }

        if (results.isEmpty()) {
            results.put("0", "EMPTY");
        }

        return  results;
    }
}
