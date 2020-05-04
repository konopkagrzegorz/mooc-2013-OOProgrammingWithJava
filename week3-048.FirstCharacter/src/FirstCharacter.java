import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.println("First character: " + firstCharacter(reader.nextLine()));
    }
    
    public static char firstCharacter(String text) {
        char first = text.charAt(0);
        return first;
    }
}
