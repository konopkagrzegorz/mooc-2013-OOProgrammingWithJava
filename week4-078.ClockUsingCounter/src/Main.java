
import java.util.Scanner;

public class Main {

    public static void main(String[] args) //throws Exception 
    {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        
       /*BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            if (seconds.getValue() == 59) {
                minutes.next();
                 if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
             seconds.next();
            }
        }*/
       
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        System.out.print("seconds: ");
        int s = reader.nextInt();// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = reader.nextInt();// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = reader.nextInt();// read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account

            i++;
        }
    }
}
