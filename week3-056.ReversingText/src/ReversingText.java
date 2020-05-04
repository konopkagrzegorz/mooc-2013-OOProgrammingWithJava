
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
            String reversed = "";
            int j = 0;
            for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
            j++;
        }
            return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
