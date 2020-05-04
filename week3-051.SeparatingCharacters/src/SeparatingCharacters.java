
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        printFirstThreeLetters(name);
    }
    
    public static void printFirstThreeLetters(String text) {
            for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            System.out.println((i+1) + ". character: " + letter);
        }
        }
}
