import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String pharse = reader.nextLine();
        printFirstThreeLetters(pharse);
    }
    
    public static void printFirstThreeLetters(String text) {
        if (text.length() >= 3) {
            for (int i = 0; i < 3; i++) {
            char letter = text.charAt(i);
            System.out.println((i+1) + ". character: " + letter);
        }
        }
    }
    
}
