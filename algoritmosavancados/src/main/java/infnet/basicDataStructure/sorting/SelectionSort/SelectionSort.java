package infnet.basicDataStructure.sorting.SelectionSort;
import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[currentMinIndex] > numbers[j]) {
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                int tmp = numbers[currentMinIndex];
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] numbers = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 0 };
        selectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
