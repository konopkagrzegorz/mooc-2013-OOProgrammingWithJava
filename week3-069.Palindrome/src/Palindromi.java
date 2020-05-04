import java.util.Scanner;

public class Palindromi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    
     public static String reverse(String text) {
            String reversed = "";
            int j = 0;
            for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
            j++;
        }
            return reversed;
     }
     
      public static boolean palindrome(String text) {
        // write code here
        String reversedText = reverse(text);
        if (text.equals(reversedText)){
            return true;
        }
        return false;
    }
}
