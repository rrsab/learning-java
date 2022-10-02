import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        m1(date);
        System.out.println(date);
    }
    public static void m1(Date date) {
        date.setTime(0);
    }
}