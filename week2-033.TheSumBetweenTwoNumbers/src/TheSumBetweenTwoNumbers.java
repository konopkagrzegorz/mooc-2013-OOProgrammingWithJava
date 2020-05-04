
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int fromWhat = reader.nextInt();
        System.out.print("Last: ");
        int toWhat = reader.nextInt();
        int sum = 0;
        while (fromWhat <= toWhat) {
            sum += fromWhat;
            fromWhat++;
        }
        System.out.println("Sum is "+ sum);
        
    }
}
