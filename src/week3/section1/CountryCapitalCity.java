package week3.section1;

public class CountryCapitalCity {

    public static void main(String[] args) {
      CountryCapitalCity countryCapitalCity = new CountryCapitalCity();
        countryCapitalCity.greeting();
        countryCapitalCity.add();
        countryCapitalCity.sub();

    }

    public  void greeting(){
        String name = "Negus";
        String homeTown = "Tampa, FL";
        int age = 34;

        System.out.println("Hello my name is " + name + " and I'm  from " + homeTown + " and I'm " + age + " years old");
    }

    public  void add(){
        int num1 = 10;
        int num2 = 3;
       System.out.println(num1 + num2);
    }
    public  void sub(){
        int num1 = 10;
        int num2 = 3;
        System.out.println(num1 - num2);
    }



}
