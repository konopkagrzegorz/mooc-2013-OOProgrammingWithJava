import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        int sum = 0;
        int count = 0;
        double average = 0;
        int isOdd = 0;
        int isEven = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        while (reader.hasNext()) {
            int number = reader.nextInt();
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even numbers: " + isEven);
                System.out.println("Odd numbers: " + isOdd);
                break;
            }
            count++;
            sum += number;
            average = (double)(sum)/(double)(count);
            if (number % 2 == 0) {
               isEven++;
            } else {
                isOdd++;
            }
        }
        

    }
}
