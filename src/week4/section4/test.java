package week4.section4;

public class test {

    /*

    - If Statement - One choice
    - If Else Statement - Two Choices
    - Else If Statement - 3 or more choices
     */

    public static void main(String[] args) {

        int age = 23;

        if (age >20){
            System.out.println("You can drink and vote");
        } else if (age > 17 && age < 21){
            System.out.println("Vote and not drink");
        } else {
            System.out.println("You can't vote or drink");
        }
    }

}
