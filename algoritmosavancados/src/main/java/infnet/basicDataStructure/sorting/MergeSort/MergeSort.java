package infnet.basicDataStructure.sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public MergeSort() {
        super();
    }

    private void merge(int[] numbers, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int[] arrayTemp = new int[end - start + 1];
        for (int k = 0; k < arrayTemp.length; k++) {
            if (i <= middle && (j > end || numbers[i] <= numbers[j])) {
                arrayTemp[k] = numbers[i];
                i++;
            } else {
                arrayTemp[k] = numbers[j];
                j++;
            }
        }
        System.arraycopy(arrayTemp, 0, numbers, start, arrayTemp.length);
    }

    private void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (end - start) / 2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] numbers = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 0 };
        mergeSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
