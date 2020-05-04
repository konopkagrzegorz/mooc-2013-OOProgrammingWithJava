
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = reader.nextInt();
        double area = 2* Math.PI * radius;
        System.out.println("Circumference of the circle: " + area);
    // Program your solution here 
    //Type the radius: 20
    //Circumference of the circle: 125.66370614359172
    }
}
