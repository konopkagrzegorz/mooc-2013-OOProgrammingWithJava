
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int userGuess=0;
        int guessCount=0;

        while (userGuess!=drawNumber()){
            System.out.println("Guess a number: ");
            userGuess = Integer.parseInt(reader.nextLine());

            if(userGuess<numberDrawn){
                System.out.println("The number is Greater "+ "Guess made: "+ guessCount);
            }else {
                System.out.println("The number is lesser "+ "Guess made: "+ guessCount);
            }
            guessCount++;
        }
        System.out.println("Congratulations, your guess is correct! ");

        }


    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
