import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date(100000000000L);
        java.util.GregorianCalendar dateGregorian = new java.util.GregorianCalendar();
       //date.setTime();
        System.out.println("Время, прошедшее с 1 января 1970 г., равно " +
                date.getTime() + " миллисекунд.");
        System.out.println(date.toString());
        dateGregorian.setTimeInMillis(1234567898765L);
        System.out.println("Дата по грегорианскому календарю = " +
                dateGregorian.get(GregorianCalendar.YEAR) + "." +
                dateGregorian.get(GregorianCalendar.MONTH) + "." +
                        dateGregorian.get(GregorianCalendar.DAY_OF_MONTH));
    }
}