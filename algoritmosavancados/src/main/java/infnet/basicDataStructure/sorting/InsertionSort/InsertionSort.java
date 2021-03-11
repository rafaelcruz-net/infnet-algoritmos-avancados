package infnet.basicDataStructure.sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int k;
            for (k = i - 1; k >= 0 && numbers[k] > numbers[k + 1]; k--) {
                int tmp = numbers[k + 1];
                numbers[k + 1] = numbers[k];
                numbers[k] = tmp;
            }
        }
    }
    
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] numbers = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 0 };
        insertionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
