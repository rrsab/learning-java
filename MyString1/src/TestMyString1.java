public class TestMyString1 {
    public static void main(String[] args) {


        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        char[] dst2 = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        MyString1 m1 = new MyString1(dst);
        MyString1 m2 = new MyString1(dst2);
        System.out.println(m1.toChars());
        System.out.println(m2.length());
        System.out.println(m1.substring(2,5).toChars());
        System.out.println(m2.toLowerCase().toChars());
        m2 = MyString1.valueOf(32145);
        System.out.println(m2.toChars());
        System.out.println(m2.toChars());
        MyString1 m3 = new MyString1(dst);
        MyString1 m4 = new MyString1(dst);
        System.out.println(m3.equals(m2));
    }
}
