import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        printReversedString(name);
    }
    
    
    public static void printReversedString(String text) {
            String reversed = "";
            int j = 0;
            for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
            j++;
        }
            System.out.println(reversed);
    }
}
