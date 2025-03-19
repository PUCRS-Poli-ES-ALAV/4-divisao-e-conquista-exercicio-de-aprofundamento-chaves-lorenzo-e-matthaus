package br.pucrs;

public class App 
{
    public static void main( String[] args )
    {
        // int[] arr = buildRandArray(32);

        // System.out.println("Before sorting:");
        // printArray(arr);

        // arr = MergeSort.mergeSort(arr);

        // System.out.println("\nAfter sorting:");
        // printArray(arr);

        long[] arr = buildRandArray(32);
        System.out.println("Array size: " + arr.length);
        long max1 = MaxVal.maxVal1(arr, arr.length);
        long max2 = MaxVal.maxVal2(arr, arr.length);

        long[] arr2 = buildRandArray(2048);
        System.out.println("Array size: " + arr2.length);
        max1 = MaxVal.maxVal1(arr2, arr2.length);
        max2 = MaxVal.maxVal2(arr2, arr2.length);

        long[] arr3 = buildRandArray(1048576);
        System.out.println("Array size: " + arr3.length);
        max1 = MaxVal.maxVal1(arr3, arr3.length);
        max2 = MaxVal.maxVal2(arr3, arr3.length);
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
