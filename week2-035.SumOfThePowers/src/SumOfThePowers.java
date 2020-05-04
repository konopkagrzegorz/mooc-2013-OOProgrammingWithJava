
import java.util.Scanner;

public class SumOfThePowers {
    public static final int first = 2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int toPower = reader.nextInt();
        int increment = 0;
        int sum = 0;
        while (increment <= toPower) {
        sum += Math.pow(first, increment);
        increment++;
        }
        System.out.println("The result is " + sum);

    }
}
