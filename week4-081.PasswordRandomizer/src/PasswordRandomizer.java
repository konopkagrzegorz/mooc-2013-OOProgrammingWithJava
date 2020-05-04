import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private String password;
    Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.password = "";
        for (int i = 0; i < passwordLength; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.randomizer.nextInt(26));
            this.password += symbol;
        }
        return this.password;
    }
}
