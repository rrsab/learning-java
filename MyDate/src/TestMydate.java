import java.util.GregorianCalendar;

public class TestMydate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        MyDate date3 = new MyDate(561555550000L);
        System.out.println(date1.toString());
        System.out.println(date2.toString());

        System.out.println("Дата по грегорианскому календарю date1= " +
                date1.getDay() + "." +
                date1.getMonth() + "." +
                date1.getYear());

        System.out.println("Дата по грегорианскому календарю date2= " +
                date2.getDay() + "." +
                date2.getMonth() + "." +
                date2.getYear());
        System.out.println("Дата по грегорианскому календарю date3= " +
                date3.getDay() + "." +
                date3.getMonth() + "." +
                date3.getYear());
    }
}
