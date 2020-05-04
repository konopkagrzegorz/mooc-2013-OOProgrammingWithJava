import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "initialValue";
        while(!word.isEmpty()){
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        System.out.println("You typed the following words:");
        Collections.reverse(words);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
