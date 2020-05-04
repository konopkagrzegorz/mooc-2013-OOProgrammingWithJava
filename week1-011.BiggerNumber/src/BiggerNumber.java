
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int x = reader.nextInt();
        System.out.println("Type another number: ");
        int y = reader.nextInt();
        
        int z = Math.max(x, y);
        System.out.println("he bigger number of the two numbers given was: " + z);

        // Implement your program here. Remember to ask the input from user
        //Type a number: 20
        //Type another number: 14
        //The bigger number of the two numbers given was: 20
    }
}
