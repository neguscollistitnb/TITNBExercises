package week6.section8;

public class NetOperatingIncomeForAnInvestmentProperty {

    public static double netOperatingIncome(double rentalIncome, double expenses , double vacancyRate){
           double effectiveRentalIncome = rentalIncome * (100 - vacancyRate) / 100;
           return effectiveRentalIncome - expenses;
    }

    public static void main(String[] args) {
        System.out.println(netOperatingIncome(5000.0, 2500.0, 10.0));
        System.out.println(netOperatingIncome(10000.0, 3000.0, 5.0));
        System.out.println(netOperatingIncome(7500.0, 4000.0, 15.0));
    }
}
