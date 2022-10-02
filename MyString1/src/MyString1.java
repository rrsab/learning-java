public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] temp = new char[end - begin];
        int j = 0;
        for (int i = begin; i < end; i++, j++) {
            temp[j] = chars[i];
        }
        chars = temp;
        return this;
    }

    public MyString1 toLowerCase() {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return this;
    }

    public static MyString1 valueOf(int i) {
        int len = lenNumber(i);
        System.out.println("len= " + len);
        char[] temp = new char[len];
        if (i < 0) {
            temp[0] = '-';
            i *= -1;
        }
        for (int j = 0; len != 0; j++) {
            temp[len - 1] = (char)(i % 10 + 48);
            i = i / 10;
            len--;
        }
        MyString1 tempMyString1 = new MyString1(temp);
        return tempMyString1;
    }

    private static int lenNumber(int i) {
        int n = 0, result = i;
        if (i <= 0)
            n++;
        for (int j = 0; result != 0; j++) {
            result = (int) result / 10;
            n++;
            //System.out.println("n= " + n + " result= " + result);
        }
        return n;
    }

    public char[] toChars() {
        return chars;
    }

    public boolean equals(MyString1 obj) {
        for (int i = 0; i < chars.length; i++) {
//            System.out.println("i= " + i + " this.chars= " + this.chars[i]);
//            System.out.println("i= " + i + "  obj.chars= " + obj.chars[i]);
            if (this.chars[i] != obj.chars[i]) {
                return false;
            }
        }
        return true;
    }
}
