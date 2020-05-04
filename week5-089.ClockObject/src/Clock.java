
public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        if(seconds.getValue() == 59){    
            if(minutes.getValue() == 59) {
                if(hours.getValue() == 23){
                    hours.setValue(0);
                } else {
                    hours.next();
                }
            }
             minutes.next();
             seconds.next();
         } else {
             seconds.next();
         }
        // Clock advances by one second
    }
    
    public String toString() {
        // returns the string representation
        return ""+this.hours +":" + this.minutes +":" +this.seconds;
    }
}
