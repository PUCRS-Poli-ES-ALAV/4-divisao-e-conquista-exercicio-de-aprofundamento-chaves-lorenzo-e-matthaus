package br.pucrs;

public class App 
{
    public static void main( String[] args )
    {
        // long[] arr = buildRandArray(32);
        // System.out.println("Array size: " + arr.length);
        // arr = MergeSort.mergeSort(arr);

        // long[] arr2 = buildRandArray(2048);
        // System.out.println("Array size: " + arr2.length);
        // arr2 = MergeSort.mergeSort(arr2);

        // long[] arr3 = buildRandArray(1048576);
        // System.out.println("Array size: " + arr3.length);
        // arr3 = MergeSort.mergeSort(arr3);
        

        // long[] arr = buildRandArray(32);
        // System.out.println("Array size: " + arr.length);
        // long max1 = MaxVal.maxVal1(arr, arr.length);
        // long max2 = MaxVal.maxVal2(arr, arr.length);

        // long[] arr2 = buildRandArray(2048);
        // System.out.println("Array size: " + arr2.length);
        // max1 = MaxVal.maxVal1(arr2, arr2.length);
        // max2 = MaxVal.maxVal2(arr2, arr2.length);

        // long[] arr3 = buildRandArray(1048576);
        // System.out.println("Array size: " + arr3.length);
        // max1 = MaxVal.maxVal1(arr3, arr3.length);
        // max2 = MaxVal.maxVal2(arr3, arr3.length);

        long x1 = 15;
        long y1 = 13;
        int bits1 = 4;
        
        System.out.println("Test Case 1: " + x1 + " * " + y1 + " (4-bit numbers)");
        long result1 = Multiply.multiply(x1, y1, bits1);
        System.out.println("Expected: " + (x1 * y1));
        System.out.println();
        
        long x2 = 65000;
        long y2 = 40000;
        int bits2 = 16;
        
        System.out.println("Test Case 2: " + x2 + " * " + y2 + " (16-bit numbers)");
        long result2 = Multiply.multiply(x2, y2, bits2);
        System.out.println("Expected: " + (x2 * y2));
        System.out.println();
        
        long x3 = 2000000000;
        long y3 = 1500000000;
        int bits3 = 32;
        
        System.out.println("Test Case 3: " + x3 + " * " + y3 + " (32-bit numbers)");
        long result3 = Multiply.multiply(x3, y3, bits3);
        System.out.println("Expected: " + (x3 * y3));
            
    }

    private static long[] buildRandArray(int size) {
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        return arr;
    }

    private static void printArray(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
