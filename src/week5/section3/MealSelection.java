package week5.section3;

import java.util.Scanner;

public class MealSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Steakhouse!");
        System.out.println("Select your meat preference (V/VG/NV):");
        String meatSelection = scanner.nextLine();

        String recommended = "";

        if (meatSelection.equals("VG")){
            System.out.println("Recommended: Steak Portobello Well Done");
        }else {
            System.out.println("Select doneness level:");
            String donenessLevel = scanner.nextLine();

            if (donenessLevel.equals("Rare")){
                recommended = "Filet Mignon";
            } else if (donenessLevel.equals("Medium Rare")){
                recommended = "Ribeye";
            } else if (donenessLevel.equals("Medium")){
                recommended = "Sirloin";
            } else {
                recommended = "New York";
            }

            System.out.println("Recommended: Steak " + donenessLevel + " " + recommended);

        }

    }
}
