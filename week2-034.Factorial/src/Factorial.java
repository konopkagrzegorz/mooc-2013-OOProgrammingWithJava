import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int increment = 1;
        int factorial = 1;
        while (increment <= number) {
            factorial *= increment;
            increment++;
        }
        System.out.println("Factorial is " + factorial);

    }
}
