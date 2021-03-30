package Laura.Sachmatai;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {


        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            System.out.println("ant " + i + " langelio padės " + result + " grūdus");
            result = result.multiply(BigInteger.valueOf(2));
        }

    }
}

