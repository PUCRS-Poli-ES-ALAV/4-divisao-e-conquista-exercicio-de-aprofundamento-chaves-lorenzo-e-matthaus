package br.pucrs;

public class App 
{
    public static void main( String[] args )
    {
        int[] arr = buildRandArray(32);

        System.out.println("Before sorting:");
        printArray(arr);

        arr = MergeSort.mergeSort(arr);

        System.out.println("\nAfter sorting:");
        printArray(arr);
        
    }

    private static int[] buildRandArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
