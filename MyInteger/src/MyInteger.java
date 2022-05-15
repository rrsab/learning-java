public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * Методы  isEven(), isOdd() и isPrime(), которые возвращают значение true,
     * если значение типа int в этом объекте является четным,
     * нечетным или простым соответственно.
     */
    public boolean isEven() {
        return (value % 2) == 0;
    }

    public boolean isOdd() {
        return (value % 2) != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return (false);
            }
        }
        return (true);
    }

    /**
     * Статические методы isEven(int), isOdd(int) и isPrime(int),
     * которые возвращают значение true, если указанное значение является четным,
     * нечетным или простым соответственно.
     */

    public boolean isEven(int newValue) {
        return (newValue % 2) == 0;
    }

    public boolean isOdd(int newValue) {
        return (newValue % 2) != 0;
    }

    public boolean isPrime(int newValue) {
        for (int i = 2; i * i <= newValue; i++) {
            if (newValue % i == 0) {
                return (false);
            }
        }
        return (true);
    }

    /**
     * Статические методы isEven(MyInteger), isOdd(MyInteger) и isPrime(MyInteger),
     * которые возвращают значение true, если указанное значение является четным,
     * нечетным или простым соответственно.
     */

    public boolean isEven(MyInteger newValue) {
        return (newValue.value % 2) == 0;
    }

    public boolean isOdd(MyInteger newValue) {
        return (newValue.value % 2) != 0;
    }

    public boolean isPrime(MyInteger newValue) {
        for (int i = 2; i * i <= newValue.value; i++) {
            if (newValue.value % i == 0) {
                return (false);
            }
        }
        return (true);
    }

    /**
     * Методы  equals(int) и equals(MyInteger),, которые возвращают значение true,
     * если значение типа int в этом объекте равняется указанному значению.
     */

    public boolean equals(int newValue) {
        return (newValue == this.value);
    }

    public boolean equals(MyInteger newValue) {
        return (this.value == newValue.value);
    }

    /**
     * Статический метод parseInt(char[]), который преобразует массив числовых
     * символов в значение типа int.
     */
    public static int parseInt(char[] newValue) {
        int result = 0;
        for (int i = 0; i < newValue.length; i++) {
            result = result * 10 + (newValue[i] - '0');
        }
        return (result);
    }

    /**
     * Статический метод parseInt(String), который преобразует строку в значение типа int.
     */
    public static int parseInt(String newValue) {
        return (Integer.parseInt(newValue));
    }

}
