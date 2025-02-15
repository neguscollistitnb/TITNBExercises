package week6.section19;

public class LoginCredentials {

    public boolean checkCredentials(String username, String password){
        return username.equalsIgnoreCase("Superstar") && password.equals("Hardpassword!");
    }
}
