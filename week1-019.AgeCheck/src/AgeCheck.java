
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = reader.nextInt();
        if (ageIsOkOrNot(age)) {
            System.out.println("OK");
        } else
            System.out.println("Impossible!");
    }
    
    public static boolean ageIsOkOrNot(int age) {
        if (age >= 0 && age <= 120)
            return true;
        else
            return false;
    }
}
