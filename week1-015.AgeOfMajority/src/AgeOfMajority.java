
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you?: ");
        int number = reader.nextInt();
        System.out.println(age(number));
    }
    
    public static String age(int number) {
        if (number < 18) {
            return "You have not reached the age of majority yet!";
        }
        return "You have reached the age of majority!";
    }
}
