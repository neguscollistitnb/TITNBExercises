package week11.section13;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class VowelCounter {

    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Dialogue", "Education"};
        countAndPrintVowels(words);

    }

    public static int vowelCounter(String word){
        int count = 0;

        for (char c : word.toLowerCase(Locale.ROOT).toCharArray()){
            if (c == 'a' ||c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }

        return count;
    }

    public static void countAndPrintVowels(String[] words){

        Map<String, Integer> vowelCounts = new HashMap<>();

        for (String word : words){
            int count = vowelCounter(word);

            vowelCounts.put(word , count);
        }

        String maxWord = "";
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry : vowelCounts.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println(maxWord + " - " + maxCount);
    }


}
