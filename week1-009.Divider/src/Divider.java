
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double x = reader.nextDouble();
        System.out.print("Type another number: ");
        double y = reader.nextDouble();
        double z = x/y;
        System.out.println("Division: " + x +"/"+ y + " = " + z);
        // Implement your program here. Remember to ask the input from user.
    }
}
