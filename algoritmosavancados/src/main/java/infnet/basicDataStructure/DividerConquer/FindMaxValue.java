package infnet.basicDataStructure.DividerConquer;

public class FindMaxValue {
    
    public int max(int array[], int start, int end) { //O(log N)
        if (end - start <= 1)
            return Math.max(array[start], array[end]);
        else {
            int m = (start + end) / 2;
            int v1 = max(array, start, m); 
            int v2 = max(array, m + 1, end);
            return Math.max(v1, v2);
        }
    }

    public int Max2(int array[], int start, int end) { //O(N) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max <= array[i])
                max = array[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 30, 4, 6, 90, 10, 50, 92 };
        FindMaxValue find = new FindMaxValue();

        int result = find.max(array, 0, array.length - 1);

        System.out.print(result);
        
    }

}
