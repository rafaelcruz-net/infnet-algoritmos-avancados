package infnet.basicDataStructure.sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 0 };
        bubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
