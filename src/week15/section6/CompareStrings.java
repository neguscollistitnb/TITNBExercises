package week15.section6;

import java.util.ArrayList;

public class CompareStrings {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("An ArrayList of strings containing the first set of strings.");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("An ArrayList of strings containing the second set of strings.");

        System.out.println(compareArrayLists(list1, list2));
    }

    public static boolean compareArrayLists(ArrayList<String> list1, ArrayList<String> list2){
        String str1 = "";
        String str2 = "";

        for (String word : list1){
            str1 += word.replaceAll("\\s+", "");
        }

        for (String word : list2){
            str2 += word.replaceAll("\\s+", "");
        }

        return str1.contains(str2);
    }
}
