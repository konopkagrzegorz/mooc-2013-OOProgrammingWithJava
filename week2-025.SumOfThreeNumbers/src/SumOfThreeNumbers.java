
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
            System.out.print("Type the first number: ");
        }
            if (i == 1) {
            System.out.print("Type the second number: ");
            }
            if (i == 2) {
            System.out.print("Type the first number: ");
            }
        read = reader.nextInt();
        sum += read;
        }

        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
