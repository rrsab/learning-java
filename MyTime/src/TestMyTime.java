public class TestMyTime {
    public static void main(String[] args) {
        MyTime T1 = new MyTime();
        MyTime T2 = new MyTime(555550000);
        MyTime T3 = new MyTime(5,23,55);
        System.out.println("Время T1= " + T1.getHour() + ":" + T1.getMinute() + ":" +
                T1.getSecond());
        System.out.println("Время T2= " + T2.getHour() + ":" + T2.getMinute() + ":" +
                T2.getSecond());
        System.out.println("Время T3= " + T3.getHour() + ":" + T3.getMinute() + ":" +
                T3.getSecond());
    }
}
