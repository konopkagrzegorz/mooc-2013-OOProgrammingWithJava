
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int toWhat = reader.nextInt();
        int increment = 1;
        int sum = 0;
        while (increment <= toWhat) {
            sum += increment;
            increment++;
        }
        System.out.println("Sum is "+sum);

    }
}
