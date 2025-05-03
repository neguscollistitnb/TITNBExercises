package week4.section14;

public class TestData {

    public static void main(String[] args) {
        ticketPrices(-12, true);// -12 true -- Invalid age
        ticketPrices(2, false);// 2 false -- Children under 3 years old - FREE!
    }

    public static void ticketPrices(int customerAge, boolean hasStudentID){

        if (customerAge < 0){
            System.out.println("Invalid age");
        }
        else if (customerAge <= 3){
            System.out.println("Children under 3 years old - FREE!");
        }
        else if (customerAge >=4 && customerAge <= 7){
            System.out.println("Children aged 4 to 7 - 50% discount!");
        }
        else if (customerAge >= 8 && customerAge <= 18){
            System.out.println("Children aged 8 to 18 - 25% discount!");
        }
        else if (customerAge >= 18 && customerAge <= 25 && hasStudentID){

            System.out.println("Students receive a 50% discount with a valid student ID!");
        }
        else if (customerAge >= 65){
            System.out.println("Seniors (65+) receive a 65% discount!");
        }
        else {
            System.out.println("Regular price applies");
        }
    }
}
