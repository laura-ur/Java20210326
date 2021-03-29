package Uzdavinys1;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {


//        BigInteger next = new BigInteger(String.valueOf(0));
//        BigInteger previous = new BigInteger(String.valueOf(1));
//
//        var next = 0;
//        var previous = 1;
        BigInteger result = BigInteger.ZERO;

        for (int i = 1; i <= 64; i++) {
            if (i == 1) {
                result = BigInteger.valueOf(1);
            } else {
//            BigInteger a = next.add(previous);
//           next += previous;
//              b = previous.multiply(BigInteger.valueOf(2));

//            next += previous;
//            previous *= 2;
                result = result.multiply(BigInteger.valueOf(2));
            }
            System.out.println("ant " + i + " langelio padės " + result + " grūdus");
        }
    }
}
//          suma :  184467440737095500007
