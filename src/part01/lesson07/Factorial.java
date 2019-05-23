package part01.lesson07;

import java.math.BigInteger;

public class Factorial implements Runnable {

    private int k;
    private BigInteger result = BigInteger.ONE;

    public BigInteger getResult() {
        return result;
    }

    public Factorial(int k) {
        this.k = k;
    }

    public void calculate() {
        for (int i = 1; i <= k; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
    }

    @Override
    public void run() {
        calculate();
    }
}