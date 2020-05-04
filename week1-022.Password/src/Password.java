
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        System.out.print("Type the password: ");
        String enteredPassword = reader.nextLine();
        if (enteredPassword.equals(password)) {
            System.out.println("Right!");
        }
        else {
            System.out.println("Wrong!");
        }
        while (!enteredPassword.equals(password)) {
        System.out.print("Type the password: ");
        enteredPassword = reader.nextLine();
        if (!enteredPassword.equals(password)) {
            System.out.println("Wrong");
        } else {
            System.out.println("Right!!");
        }
        }
        if (enteredPassword.equals("carrot")) {
            System.out.println("The secret is: jryy qbar!");
        }
        
        // Write your code here
    }
}
