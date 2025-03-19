package br.pucrs;

public class MaxVal {
    private static long numberComparisons;
    
    public static long maxVal1(long A[], int n) {
        double startTime = System.nanoTime();
        long iterations = 0;

        long max = A[0];
        for (int i = 1; i < n; i++) {  
            iterations++;
            if( A[i] > max ) 
               max = A[i];
        }

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("maxVal1 duration: " + duration + "ms");
        System.out.println("maxVal1 comparisons: " + iterations);
        return max;
    }

    public static long maxVal2(long A[], int n) {
        double startTime = System.nanoTime();
        numberComparisons = 0;
        long result = maxVal2Helper(A, 0, n-1);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        
        System.out.println("maxVal2 duration: " + duration + "ms");
        System.out.println("maxVal2 comparisons: " + numberComparisons);
        return result;
    }
    
    private static long maxVal2Helper(long A[], int init, int end) {
        if (end - init <= 1) {
            return max(A[init], A[end]);  
        } else {
            int m = (init + end)/2;
            long v1 = maxVal2Helper(A, init, m);   
            long v2 = maxVal2Helper(A, m+1, end);  
            return max(v1, v2);
        }
    }
    
    public static long max(long a, long b) {
        numberComparisons++;
        return (a > b) ? a : b;
    }
}