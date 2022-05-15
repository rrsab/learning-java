public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger M1 = new MyInteger(11);
        System.out.println("M1= " + M1.getValue());
        System.out.println("M1.isEven= " + M1.isEven());
        System.out.println("M1.isOdd= " + M1.isOdd());
        System.out.println("M1.isPrime= " + M1.isPrime());
        System.out.println("M1.isEven(newValue)= " + M1.isEven(12));
        System.out.println("M1.isOdd(newValue)= " + M1.isOdd(12));
        System.out.println("M1.isPrime(newValue)= " + M1.isPrime(12));
        MyInteger M2 = new MyInteger(15);
        System.out.println("M2= " + M2.getValue());
        System.out.println("M1.isEven(M2)= " + M1.isEven(M2));
        System.out.println("M1.isOdd(M2)= " + M1.isOdd(M2));
        System.out.println("M1.isPrime(M2)= " + M1.isPrime(M2));
        System.out.println("M1.equals(11)= " + M1.equals(11));
        System.out.println("M1.equals(M2)= " + M1.equals(M2));
        char[] tmp = {'2','1'};
        System.out.println("M1.parseInt('2', '1')= " + M1.parseInt(tmp));
        System.out.println("M1.parseInt(1232)= " + M1.parseInt("1232"));
    }
}
