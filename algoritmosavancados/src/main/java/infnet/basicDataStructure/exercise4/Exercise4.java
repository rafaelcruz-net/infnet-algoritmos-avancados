package infnet.basicDataStructure.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(Exercise4.convertToDecimal("10110"));
    }

    public static int convertToDecimal(String binary) {
        int conversion = 1;
        int result = 0;

        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1') {
                result += conversion;
            }
            conversion *= 2;
        }

        return result;
    }
}

