public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }
        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {         // 92.1 -- will this work with private variables like comparedDate.year ??

        int totalDays1 = this.day+(this.month*30)+(this.year*365);
        int totalDays2 = comparedDate.day+(comparedDate.month*30)+(comparedDate.year*365);

        int daysDifferent = 0;
        if (totalDays1==totalDays2) {
            return 0;
        } else if (totalDays1 > totalDays2) {                               // 92.3
            daysDifferent = totalDays1 - totalDays2;
        } else {
            daysDifferent = totalDays2 - totalDays1;
        }


        return (int) daysDifferent / 365;               // revamped 92.2
    }
  
}
