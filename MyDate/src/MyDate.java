import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar();
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DATE);
    }

    public MyDate(long elapsedTime) {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DATE);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DATE);
    }
}
