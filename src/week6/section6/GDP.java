package week6.section6;

public class GDP {

    /*
    Create a Java program that includes a static method named calculateGDP().
    The method should take four doubles as params - consumption (C), investment (I),
    governmentSpending (G), and netExports (NX) in the same exact order -
    and calculate the Gross domestic product (GDP) using the formula Y = consumption
    + investment + governmentSpending + netExports. The method should have a void return
    type, which means it does not return a value but simply performs the calculation and prints
    the result to the console.
     */

   public  void calculateGDP(double consumption, double investment, double governmentSpending, double netExports){
       double gdp = consumption + investment + governmentSpending + netExports;

       System.out.println(gdp);
   }


}
