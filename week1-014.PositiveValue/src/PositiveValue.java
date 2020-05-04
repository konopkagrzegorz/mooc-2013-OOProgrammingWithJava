
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        System.out.println(value(number));

        // Type your program here:
        //Type a number: 5
        //The number is positive.
    }
    
    public static String value(int number) {
        if (number > 0) {
            return "The number is positive";
        }
        return "The number is not positive";
    }
}
