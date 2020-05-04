
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int grade = reader.nextInt();
        System.out.print("Grade: ");
        System.out.println(gradeGet(grade));
    }
    
    public static String gradeGet(int grade) {
        if (grade >= 0 && grade <= 29) {
            return "failed";
        } else if (grade > 29 && grade <= 34) {
            return "1";
        } else if (grade > 34 && grade <= 39) {
            return "2";
        } else if (grade > 39 && grade <= 44) {
            return "3";
        } else if (grade > 44 && grade <= 49) {
            return "4";
        } else {
            return "5";
        }
}
}
