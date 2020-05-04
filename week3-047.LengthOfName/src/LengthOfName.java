
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.err.print("Type your name: ");
        System.out.println("Number of characters: " + calculateCharacters(reader.nextLine()));
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }
    
}
