import java.math.BigInteger;

public class Tests {
    public static void main(String[] args) {
        java.math.BigInteger x = new java.math.BigInteger("2");
        java.math.BigInteger y = new java.math.BigInteger("3");
        java.math.BigInteger z = new java.math.BigInteger("10000000000000000000" +
                "000000000000000000000000000000");
        int count = 1;
        for (int i = 0; count <= 50 ; i++) {
            if ((z.remainder(y)).intValue() == 0 | (z.remainder(x)).intValue() == 0) {
                System.out.println(count + ". z равно " + z);
                count++;
            }
            z = z.add(java.math.BigInteger.ONE);
        }
    }
}
