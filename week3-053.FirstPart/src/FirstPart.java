
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int index = reader.nextInt();
        String dividedWord = word.substring(0, index);
        System.out.println("Result: " + dividedWord);
        
    }
}
