package infnet.basicDataStructure.Search;

public class ArraySearch {
    public int search(int value, int[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();
        int[] arrayToSearch = new int[] { 10, 18, 45, 20, 75, 2, 3, 70 };
        System.out.println("indice do array é " + arraySearch.search(20, arrayToSearch));
    }
}
