import java.math.BigInteger;

public class squareNumbers {
    public static void main(String[] args) {
        java.math.BigInteger x;
        java.math.BigInteger x2;
        int count = 1;
        long x1 = Long.MAX_VALUE;
        long y1 = (long)Math.sqrt(x1);
        for (int i = 1; count <= 10 ; i++) {
            y1++;
            x2 = new java.math.BigInteger(String.valueOf(y1));
            x = x2.pow(2);
            System.out.println(x);
            count++;
        }

    }
}

