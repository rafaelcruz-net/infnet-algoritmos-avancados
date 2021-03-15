package infnet.basicDataStructure.Search;

public class BinarySearch {

    private int binarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    private int binarySearchRecursivo(int[] sortedArray, int key, int low, int high) {

        int middle = (low + high) / 2;
        if (high < low) 
            return -1;

        if (key == sortedArray[middle]) 
            return middle;
        else if (key < sortedArray[middle])
            return binarySearchRecursivo(sortedArray, key, low, middle - 1);
        else
            return binarySearchRecursivo(sortedArray, key, middle + 1, high);
        
    }

    public int binarySearch(int[] array, int value) {
        //return binarySearch(array, value, 0, array.length - 1);
        return binarySearchRecursivo(array, value, 0, array.length - 1);
    }


    public static void main(String args[]) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arrayToSearch = new int[] { 2, 3, 10, 18, 20, 45, 70, 75, };
        System.out.println(binarySearch.binarySearch(arrayToSearch, 45));
        
    }
}
