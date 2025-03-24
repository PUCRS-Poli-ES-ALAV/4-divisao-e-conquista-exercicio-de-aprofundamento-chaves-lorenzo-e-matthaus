package br.pucrs;

public class Multiply {
    private static long numberRecursiveCalls = 0;
    
    public static long multiply(long x, long y, int n) {
        numberRecursiveCalls = 0;
        double startTime = System.nanoTime();
        
        long result = multiplyHelper(x, y, n);
        
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        
        System.out.println("Multiply algorithm for " + n + "-bit numbers");
        System.out.println("Result: " + result);
        System.out.println("Duration: " + duration + " ms");
        System.out.println("Recursive calls: " + numberRecursiveCalls);
        
        return result;
    }
    
    private static long multiplyHelper(long x, long y, int n) {
        numberRecursiveCalls++;
        
        if (n == 1) {
            return x * y;
        } else {
            int m = n / 2;
            
            long powerOfTwo = (long) Math.pow(2, m);
            
            long a = x / powerOfTwo;
            long b = x % powerOfTwo;
            long c = y / powerOfTwo;
            long d = y % powerOfTwo;
            
            long e = multiplyHelper(a, c, m);
            long f = multiplyHelper(b, d, m);
            long g = multiplyHelper(b, c, m);
            long h = multiplyHelper(a, d, m);
            
            long powerOfTwo2m = (long) Math.pow(2, 2 * m);
            
            return (powerOfTwo2m * e) + (powerOfTwo * (g + h)) + f;
        }
    }
}