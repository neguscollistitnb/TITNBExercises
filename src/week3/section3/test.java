package week3.section3;

import week3.section1.CountryCapitalCity;

public class test {



    public static void main(String[] args) {
        CountryCapitalCity countryCapitalCity = new CountryCapitalCity();


        String name = "Mike Collis";
        int age = 12;
        int zipCode = 23232;
        String email = "test3@gmail.com";

        // Hi my name is Negus Collis and I am 34 years old and I live in the zipcode 34543 and you can reach me at test@gmail.com

        System.out.println("Hi my name is " + name + " and I am " + age + " years old and I live in the zipcode "
                + zipCode + " and you can reach me at " + email);
    }
}
