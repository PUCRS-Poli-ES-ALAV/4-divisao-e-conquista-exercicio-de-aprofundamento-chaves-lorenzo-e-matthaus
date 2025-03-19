package br.pucrs;

public class MergeSort {
    private static long numberComparisons;

    public static long[] mergeSort(long[] arr) {
        double startTime = System.nanoTime();
        numberComparisons = 0;
        long[] result = mergeSortHelper(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("mergeSort duration: " + duration + "ms");
        System.out.println("mergeSort comparisons: " + numberComparisons);
        return result;
    }

    public static long[] mergeSortHelper(long[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int middle = arr.length / 2;
        long[] left = new long[middle];
        long[] right = new long[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        left = mergeSortHelper(left);
        right = mergeSortHelper(right);

        return merge(left, right);
    }

    public static long[] merge(long[] left, long[] right) {
        long[] result = new long[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            numberComparisons++;
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}