
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String name = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        if (checkAccount(name, password))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");
    }
    
    public static boolean checkAccount(String name, String password) {
        if (name.equals("alex") && password.equals("mightyducks"))
            return true;
        else if (name.equals("emily") && password.equals("cat"))
                return true;
        else
            return false;
    }
}
