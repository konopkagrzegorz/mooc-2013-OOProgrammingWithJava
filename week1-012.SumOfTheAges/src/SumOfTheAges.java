
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String nameFirst = reader.nextLine();
        System.out.print("Type your age: ");
        int ageFirst = reader.nextInt();
        reader.nextLine();
        System.out.print("Type your name: ");
        String nameSecond = reader.nextLine();
        System.out.print("Type your age: ");
        int ageSecond = reader.nextInt();
        int sum = ageFirst + ageSecond;
        System.out.println(nameFirst + " and " + nameSecond + " are " + (sum) + " years old in total.");
        // Implement your program here
        //Type your name: Matti
        //Type your age: 14
        //Type your name: Arto
        //Type your age: 12
        //Matti and Arto are 26 years old in total.
    }
}
