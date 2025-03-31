package br.pucrs;

import java.math.BigInteger;

public class Multiply {
    private static long numberRecursiveCalls = 0;
    
    public static BigInteger multiply(BigInteger x, BigInteger y, int n) {
        numberRecursiveCalls = 0;
        double startTime = System.nanoTime();
        
        BigInteger result = multiplyHelper(x, y, n);
        
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        
        System.out.println("Multiply algorithm for " + n + "-bit numbers");
        System.out.println("Result: " + result);
        System.out.println("Duration: " + duration + " ms");
        System.out.println("Recursive calls: " + numberRecursiveCalls);
        
        return result;
    }
    
    public static BigInteger multiply(long x, long y, int n) {
        return multiply(BigInteger.valueOf(x), BigInteger.valueOf(y), n);
    }
    
    private static BigInteger multiplyHelper(BigInteger x, BigInteger y, int n) {
        numberRecursiveCalls++;
        
        if (n == 1) {
            return x.multiply(y);
        } else {
            int m = n / 2;
            
            BigInteger powerOfTwo = BigInteger.valueOf(2).pow(m);
            
            BigInteger a = x.divide(powerOfTwo);
            BigInteger b = x.remainder(powerOfTwo);
            BigInteger c = y.divide(powerOfTwo);
            BigInteger d = y.remainder(powerOfTwo);
            
            BigInteger e = multiplyHelper(a, c, m);
            BigInteger f = multiplyHelper(b, d, m);
            BigInteger g = multiplyHelper(b, c, m);
            BigInteger h = multiplyHelper(a, d, m);
            
            BigInteger powerOfTwo2m = BigInteger.valueOf(2).pow(2 * m);
            
            return powerOfTwo2m.multiply(e)
                   .add(powerOfTwo.multiply(g.add(h)))
                   .add(f);
        }
    }
}